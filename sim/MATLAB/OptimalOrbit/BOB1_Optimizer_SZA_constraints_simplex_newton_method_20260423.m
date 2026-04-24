%{
@file    BOB1_Optimizer_SZA_constraints_simplex_newton_method_20260423.m
@author  Zander Abid / UCMerced (zabid@ucmerced.edu)
@date    2026-04-23
@brief   Main file for executing Bobsat-1 orbital optimization
 
@section This file is to apply both the quasai-newton and simplex (altered to Nedler-mead) 
algorithm
in attempting to find a feasable region of solutions for the orbital
parameters of bobsat-1
%}



clc; clear all;

% PARAMETERS
t0 = [2024,10,15,19,0,0]; % year, month, day, hour, minute, second
tf = 2; % Total amount of days elapsed till de-orbit, (for testing purposes keep low)
x0 = [65, 40, 0, 30]; % Inclination, RAAN, argument of perigee (w), inital true anomoly (nu)



% IC = Initial Conditions
% --- Optimizing (Engineering Method) ---

% optins for tuning minimizer 
main_optimizer_options = optimoptions("fmincon", ... % 
                                        "Algorithm","active-set");

% Solver
[best_IC] = main_optimizer(@objective_fun, x0, t0, tf, main_optimizer_options);



% --- Optimizing (Class Implimentation)---

% Simplex (needs to update to nedler-mead)
% simplexmethod([1],[1],[1])

% Quasai-Newton
% Set maxiter = 30, if want to change go into quasi_newton.m
% quasai_newton(@objective_fun,x0,t0,tf); % Displays optimal result after completion
