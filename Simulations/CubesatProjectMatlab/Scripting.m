clc; clear all; close all;

model_name = 'asbCubeSat';

block_path = [model_name '/Vehicle Model/Vehicle Control Actuators/CubeSat Perfect Actuators'];

gain_value_str = get_param(block_path, 'Torques');