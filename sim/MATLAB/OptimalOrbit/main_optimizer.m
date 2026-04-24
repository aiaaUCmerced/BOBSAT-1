%{
@file    main_optimizer.m
@author  Zander Abid / UCMerced (zabid@ucmerced.edu)
@date    2026-04-23
@brief   Functional and most likely to be used optimizer
 
@section This will be the engineering approach to optimizing the problem at
hand, utilizing pre-built best functions and pre-existing code written
specifically for our problemset of BOBSAT
%}



function [best_IC, best_IC_val] = main_optimizer(functionHandle, x0, t0, tf, customOptions)
    %{
    Params: 
        functionHandle - function handle (use @obj_fun when calling method)
        x0 - [Inclination_0
             R.A.A.N_0
             Argument of Perigee (w)_0
             Initial true anomaly_0
            ]
        
        t0 - [year, month, day, hour, minute, second]
        tf - # of days elapsed till end
    Return Val:
        x_opt - optimal x values per iteration
        f_opt - optimal total function values
        iter  - iteratin number on 
    %}
    

    % Origional function is a maximizer, so invert to convert to minimizing
    % objective_fun

    min_obj_fun = @(x) -1 * functionHandle(x, t0, tf);
    x_lower_bounds = [0; % i = 0
                      0; % RAAN = 0
                      0;
                      0;];

    x_upper_bound = [180;  % i <= 180 degrees
                      360; % RAAN <= 0 degrees
                      360; % w <= 360 degrees
                      360  % nu <= 360 degrees
                      ];
    
    % No linear constraints or bounds, set to empty []
    A = []; b = []; Aeq = []; beq = [];

    % Appologies for the long line
    fprintf('i : %.2f Deg\nRAAN : %.2f Deg\nw : %.2f Deg\nnu : %.2f Deg\nt0 : %.i-%.i-%.i\nElapsed Days : %.2f\n', x0(1),x0(2),x0(3),x0(4), t0(1),t0(2),t0(3), tf);

    disp('Executing Optimization....')
    [x_opt, min_val] = fmincon(min_obj_fun, x0, A, b, Aeq, beq, x_lower_bounds, x_upper_bound, [], customOptions);
    best_IC = x_opt;
    best_IC_val = -min_val;
    
    fprintf('Best i : %.2f Deg\nBest RAAN : %.2f Deg\nBest w : %.2f Deg\nBest nu : %.2f Deg\nBest SZAT : %.2f\n', best_IC(1),best_IC(2),best_IC(3),best_IC(4), best_IC_val);


end