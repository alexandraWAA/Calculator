<div>

## Calculator
</div>

___
### Разработчик/Developer
- [Волчихина Александра](https://github.com/Homychok)

___
## Description

Create a console application called "Calculator". The application must read from the console the strings, numbers, arithmetic operations between them and output the result to the console.
Implement class Main with method public static String calc(String input). The method should accept a string with an arithmetic expression between the two numbers and return a string with the result of their execution. You can add your own imports, classes, and methods. Added classes must not have access modifiers (public or otherwise)
___
## Requirements

- The calculator knows how to perform addition, subtraction, multiplication, and division operations with two numbers: a + b, a - b, a * b, a / b. 
  The data is transmitted in one line! 
  Solutions in which each number and arithmetic operation is passed on a new line are considered incorrect.
- The calculator can handle both Arabic (1,2,3,4,5...) and Roman (I,II,III,IV,V...) numbers.
- The input of the calculator should be limited to numbers from 1 to 10.
  The output numbers are not limited in size and may be any.
- The calculator can only work with integers.
- The calculator can only work with Arabic or Roman numbers at the same time, if the user enters a string like 3 + II, the calculator must throw an exception and stop its work.
- When entering Roman numbers, the answer must be printed in Roman numerals, respectively, when entering Arabic numerals, the answer is expected in Arabic numerals.
- If the user enters unsuitable numbers, the application throws an exception and terminates.
- If the user enters a string that does not match one of the arithmetic operations described above, the application throws an exception and exits.
- The result of the division operation is an integer, the remainder is discarded. 
- The result of the calculator with arabic numbers can be negative numbers and zero. 
  The result of the calculator with Roman numbers can only be positive numbers, if the result is less than one, an exception is thrown
