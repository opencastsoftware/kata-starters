Binary Operator Calculator


Given a string which describes a binary operation (https://en.wikipedia.org/wiki/Binary_operation) on two numbers, calculate and return the result of applying the operation. The supported operations are:



addition (+),

subtraction (-),

multiplication (*), and

(Stretch goal) square root of a number rounded down plus value (int_root_plus)



Examples:



"4 int_root_plus 3" = (4 ^ 1/2) + 3 = 2 + 3 = 5

"8 int_root_plus 3" = (5 ^ 1/2) + 3 = (2.82) + 3 = 2 + 3 = 5

"9 int_root_plus 3" = (9 ^ 1/2) + 3 = 3 + 3 = 6



Note: This is not a symbolic operator

see requirement 3 for handling errors






Assumptions:



Assume the we are working with Integers

Assume that the string is well formatted as: "number operator number". Spaces are permitted anywhere before and after the numbers but there will not be any spaces between any characters of the number.




Requirements



The main function must accept a string (see assumption 2), and return the result as a number or the error as a string






Errors in input:



If there is a problem with the string return the message: "Error: Invalid input"








(Stretch) If one the numbers is invalid, then return the error message "Error: Invalid input in {left value / right value}. Expected a number but found '{value here}'"



Examples of valid input:



"15+2"

"99+    2"

"-100  + 2"

"23 + -102" (Note: You can add a negative number)

"23 - -102" (Note: You can subtract a negative number)

"8 int_root_plus 1"










Examples of invalid input:



"Error: 1 + a2b" -> Invalid input in right value. Expected a number but found 'a2b'








(Stretch) If the operation is not valid, return the error message "Error: Invalid input. Binary operator not supported"






(Stretch goal) int_root_plus



If the first second number is negative, then the return the error message, "Invalid input. Square root only supports positive numbers, or else it will be a figment of our imagination!"

Hints



Regex that matches the pattern is: ^\s*(-?\d+)\s*(.+?)\s*(-?\d+)\s*$