Title: Java Operators  
Author: Brooke Taylor  
Date: 01/27/2025  
Description: Operators

[w3schools.com](https://www.w3schools.com/java/java_operators.asp)

# Java Operators

Operators are used to perform operations on variables and values. 

    int x = 100 + 50;

Although the `+` operator is often used to add together two values, it can also be used to add together a variable and a value, or a variable and another variable: 

    int sum1 = 100 + 50;        // 150
    int sum2 = sum1 + 250       // 400
    int sum3 = sum2 + sum2      // 800

Java divides the operators into the following groups: 

* Arithmetic 
* Assignment 
* Comparison
* Logical 
* Bitwise

## Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.

| Operator | Name | Description | Example |
| ----------- | ----------- | ----------- | ----------- |
| + | Addition | Adds together two values | x + y |
| - | Subtraction | Subtracts one value from another | x - y |
| * | Multiplication | Multiplies two values | x * y |
| / | Division | Divides one value by another | x / y |
| % | Modulus | Returns the division remainder | x % y |
| ++ | Increment | Increases the value of a variable by 1 | ++x |
| -- | Decrement | Decreases the value of a variable by 1 | --x |

## Java Assignment Operators

Assignment operators are used to assign values to variables. 

    int x = `0;

The **addition assignment** operator (`+=`) adds a value to a variable:

    int x = 10;
    x += 5;

| Operator | Example | Same As | 
| ----------- | ----------- | ----------- | 
| = | x = 5 | x = 5 |
| += | x += 3 | x = x + 3 |
| -= | x -= 3 | x = x - 3 |
| *= | x *= 3 | x = x * 3 |
| /= | x /= 3 | x = x / 3 |

> Others include: %=, &=, |=, ^=, >>=, <<=

## Java Comparison Operators

Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

The return value of a comparison is either `true` or `false`. These values are known as Boolean values.

    int x = 5;
    int y = 3; 
    System.out.println(x > y);    // returns true, because 5 is higher than 3

| Operator | Name | Example | 
| ----------- | ----------- | ----------- | 
| == | Equal to | x == y |
| != | Not Equal | x != y |
| > | Greater than | x > y |
| < | Less than | x <> y |
| >= | Greater than or equal to | x >= y |
| <= | Less than or equal to | x <= y |

## Java Logical Operators

You can also test for `true` or `false` values with logical operators. 

| Operator | Name | Description | Example |
| ----------- | ----------- | ----------- | ----------- | 
| && | Logical and | Returns true if both statements are true | x < 5 && < 10 |
| \|\| | Logical or | Returns true if one of the statements is true | x < 5 \|\| x < 4 |
| ! | Logical not | Reverse the result, returns false if the result is true | !(x < 5 && x < 10) |

