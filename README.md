# Assignment 1 - Table print

Learning outcomes

The student must show the ability to create a small program with a structured and annotated program flow as well as proficiency in declaring/initiating variables and constants before assignment through simpler calculations with commonly used data types.
Prerequisites

The assignment presupposes that you have studied moment 0 and 1, including practice assignment Hello World.

Task: Write a program that calculates and presents the table below in a nice way. You should only create a class in the assignments and use constants for values ​​that do not change.

Begin the task by constructing a flow chart and program logic on paper. Then describe your structure in text form (pseudocode) in the comment header of the program so that an outsider can understand what the program does and how your logic/algorithm works.

You should calculate the charging time for an electric car with a battery with the "storage power" 35.8 kWh (e-golf) for some common combinations of current and voltage when charging. In the task, we assume that the charging power is current x voltage (single-phase 230V) and current x voltage x square_root(3)(three-phase 400V). We also expect the battery to be charged with maximum power from empty to fully charged, ie. charging time is storage power through charging power.

Note that the calculations must be "manually" rounded to a maximum of two decimal places. You must therefore use conversions to "cut off" unwanted decimal digits. See example in Uppgiftsbank 2 on Canvas

It is allowed to use methods in java.lang.Math (eg the square root Math.sqrt ()) in your calculations. You should therefore not use Java conversions (eg DecimalFormat) but do this conversion "manually".

For all prints, the print () method must be used ( not println or printf ). Use control characters to customize the printout (See Task 1.4). You get to test yourself how many "tabs" will be appropriate.

Text in the printouts can be hard-coded, that is, you simply enter the "text string" to be printed directly in the print kit.

The following should be printed by your program:

![Alt text](picture.png)
