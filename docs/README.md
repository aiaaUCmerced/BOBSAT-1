# About

This is a short rundown on basic ettiquet on naming conventions and coding standards for files. A more detailed breakdown shall be made aiming to resolve naming conflicts and outline testing procedures for code.

# Github Ettiquete

1. Always pull updates, as without doing so may introduce conflicts

2. Always push to the main branch

3. Any fime named temp, TEMP, xxxx_TEMP, xxx_temp shall be capable of deletion 
without any major conflict
4. Please do not push python virtual environemnts PLEASE PLEASE PLEASE (Include \<python virtual env name\>/* in .gitignore)
Only exception is for the F prime environemnt

5. Don't push export controlled files to the github, or else (ex confidential solidworks parts from companies). All those shall remain in The Box

# Naming Conventions (CODE)

```
snake_case = Local Variable

ALL_CAPS_SNAKE_CASE = Global Constants

PascalCase = Class/Struct

camelCase = Functions

m_prefix_snake_case = Private Members

p_prefix = Pointers

```

Avoid Ambiguity. Example:

```
v = 1.0; % Not allowed, v can mean voltage, velocity etc

tau = 1.0; % Allowed, expected to be overwritten within the loop

temp = 99; % Special, denoted as temporary and expected to be overwritten.

% Note temperature is not temp, and thus must be written out fully


```

Only exception is a-z, A-Z and greek letters alpha-zeta, ALPHA-ZETA. These are to be used in a given formula that is restricted to a certain scope and can be overwritten.



# Naming Convention (FILES)


When in doubt, be as descriptive as possible. Also apply similar coding principals, for example variables 
and data follow snake case and other.

Generally follow this method:

[Project]\_[subsystem]\_[Description]\_[Date Created]\_[version number].[file path]

1. Project - BOBSAT-1 (BOB1)

2. Subsystem (Acronyms highly encouraged) - ADCS, OBCS, ENV, SIM, CAD, etc.

3. Description - Can include multiple underscores (ex. OrbitalAnalysis or VibrationAnalysis_LaunchLoad_15Hz). Generally the case  doesnt matter but rather the description.

4. Date Created - YYY-MM-DD (2026416) however more specific instances require YYY-MM-DD-T-HH-MM-SS (April 14, 2026 PDT 9:30:15 -> 20260414T09315 with T being time separator).

5. Version - always have v01 as the start, with v1 becoming the 10th version and v2 being the 20th version

Any file with the inital word TEMP,temp,Temp are designated for deletion at any point without affecting any
other files. These just need a short description ontop of the file for what they do briefly


The only files exempt/alternate from this naming convention are files located in src that relate to flight software
THose rules are contained in the /docs section from root.


# Classification of Code

Per NASA classification of software, this method loosely follows this ideology.

[NASA Classification](https://nodis3.gsfc.nasa.gov/displayDir.cfm?Internal_ID=N_PR_7150_002D_&page_name=AppendixD)

1. A - Humans rated software (Must follow Powers of 10 strictly)
2. B - Missions could be lost (Must follow Powers of 10 strictly)
3. C - Mission support / Ground Systems
4. D - Science and Engineering design 
5. E - Design Concept, Research
6. F - General purpose computing

In code, this is the information that should be at the top of all files

```
/**
 * @file    BOB1_README.md
 * @author  Zander_Abid/UCMerced
 * @date    2026-04-16
 * @brief   Provide Naming and coding etiquette
 *
 * @section DESCRIPTION
 * This gives a short hand methodology that the github shall follow and serves as an introduction on how to 
 * effectively conribute to the project and traverse the pre-existing work
 */

```


# Powers of 10
These rules include things like no jump, goto statements, no recursion, upper bounds on loops and other coding conventions that must be followed. Please read the following document to get a better understanding.

[Link to Power of 10](https://spinroot.com/gerard/pdf/P10.pdf)


# File Structure

Outlines what files generally go where

/docs = design reviews, mission statements 
> pdf txt docx excel

/analysis = trade studies, feasability studies, link budgets etc
> pdf excel sysml 

/sim = simulation files. Think matlab and ansys as well as other code
> matlab(m) ansys simulink misc

/src = Basically flight softwaree and running mission critical code (MUST FOLLOW POWERS OF 10)
> any regarding flight software

/test = test cases mostly reserved for the software portion
> c cpp py test case

/scripts = Used for automation, non-critical 
> misc

/data
> excel tif py ipynb

1. Sysml go in analysis, despite being simulation technically
2. 