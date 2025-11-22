Title: Java If ... Else  
Author: Brooke Taylor  
Date: 01/27/2025  
Description: If Else

[w3schools.com](https://www.w3schools.com/java/java_conditions.asp)

# If ... Else

Java has the following conditional statements: 

* Use `if` to specify a block of code to be executed, if a specified condition is true
* Use `else` to specify a block of code to be executed, if the same condition is false
* Use `else if` to specify a new condition to test, if the first condition is false
* Use `switch` to specify many alternative blocks of code to be executed

## The if Statement

Use the `if` statement to specify a block of Java code to be executed if a condition is `true`.

    if (condition) {
      // block of code to be executed if the condition is true
    }

In the example below, we test two values to find out if 20 is greater than 18. If the condition is `true`, print some text: 

    if (20 > 18) {
      System.out.println("20 is greater than 18");
    }

    // Can also test variables: 

    int x = 20;
    int y = 18;
    if (x > y) {
      System.out.println("x is greater than y");
    }

## The else Statement

Use the `else` statement to specify a block of code to be executed if the condition is `false`.

    int time = 20;
    if (time < 18) {
      System.out.println("Good Day.");
    } else {
      System.out.println("Good evening.")
    }

