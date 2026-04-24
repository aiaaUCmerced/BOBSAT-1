%{
@file    objective_fun.m
@author  Zander Abid / UCMerced (zabid@ucmerced.edu)
@date    2026-04-23
@brief   Definition of solar zenith angle function and constraint, set to
maximize
 
@section This is the objective function for the BOBSAT-1 satellite to
simulate different time and other critical orbital parameters and how they
affect the solar zenith angle (SZA). The optimizer function.

%}

function r = objective_fun(x, t0, tf)
    %{
        x = [Inclination
             R.A.A.N
             Argument of Perigee (w)
             Initial true anomaly
            ]
        
        returns: Total time viewing 
    %}
    % km to match mu units
    a = 6378 + 500;     % Semi-major axis in km (Radius of earth + 500km altitude)
    e = 0.001;    % Eccentricity (Needs to be greater than 0)
    solarZenithLowerBounds = 30; % Degrees
    solarZenithUpperBounds = 50; % Degrees
    % disp(x)


    % Input Variables from Optimizer/Vector
    i    = x(1);  % inclination
    RAAN = x(2);  % Right Ascension of Ascending Node
    w    = x(3);  % argument of perigee
    nu   = x(4);  % initial true anomaly

    % UC Merced Coordinates
    UCM_lat = 37.3647;
    UCM_lon = -120.4242;
    alt = 0;
    
    % Time Setup
    totalDays = tf; % Might consider incorporating the variable into the t0
    t0 = datetime(t0(1),t0(2),t0(3),t0(4),t0(5),t0(6), 'TimeZone', 'UTC');
    tf = t0 + days(totalDays);
    dt = 30; % Increased step size slightly for speed, matches loop
   
    % Scenario Setup
    sc = satelliteScenario(t0, tf, dt);
    sat = satellite(sc, a*1000, e, i, RAAN, w, nu); % satellite function expects meters, a*1000 to meters
    gs = groundStation(sc, UCM_lat, UCM_lon, 'Name', 'UC Merced');
    
    % Pre-calculate Access intervals to speed up the loop
    acc = access(sat, gs);
    t_series = t0:seconds(dt):tf;
    
    % Pre-calculate Ground Station ECEF
    wgs84 = wgs84Ellipsoid;
    [xg, yg, zg] = geodetic2ecef(wgs84, deg2rad(UCM_lat), deg2rad(UCM_lon), alt);
    r_ground = [xg; yg; zg];
    zenith = r_ground / norm(r_ground);

    total_SZA_time = 0.0;

    % Loop through time steps
    for k = 1:length(t_series)
        ti = t_series(k);
        
        % 1. Check if satellite is actually visible to GS
        % SZA is about the Sun, but "Coverage" requires the Sat
        if accessStatus(acc, ti)
            
            % 2. Calculate Solar Zenith Angle (SZA)
            jd = juliandate(ti);
            r_sun_eci = planetEphemeris(jd, 'Earth', 'Sun'); % In km
            
            % Convert Sun to ECEF
            r_sun_ecef_temp = eci2ecef(ti, r_sun_eci);
            r_sun_ecef = r_sun_ecef_temp(:);
    
            % Sun direction vector from ground station
            sun_vec = r_sun_ecef - (r_ground / 1000); % Convert r_ground to km
            sun_dir = sun_vec / norm(sun_vec);
    
            % Calculate Angle
            SZA = acosd(dot(zenith, sun_dir));
    
            % 3. Check if SZA is within your scientific window
            if SZA >= solarZenithLowerBounds && SZA <= solarZenithUpperBounds
                total_SZA_time = total_SZA_time + dt;
            end
        end
    end

    r = total_SZA_time;
    
    % fprintf('i : %.2f\nRAAN : %.2f\nw : %.2f\nnu : %.2f\nSZAT : %.2f\n', x(1),x(2),x(3),x(4), total_SZA_time);


end