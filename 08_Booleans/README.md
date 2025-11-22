Title: Java Booleans  
Author: Brooke Taylor  
Date: 01/27/2025  
Description: Booleans

[w3schools.com](https://www.w3schools.com/java/java_booleans.asp)

# Booleans

Very often, in programming, you will need a data type that can only have one of two values, like: 

* YES / NO
* ON / OFF
* TRUE / FALSE

A boolean type is declared with the `boolean` keyword and can only take the values `true` and `false`: 

    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);        // Outputs true
    System.out.println(isFishTasty);      // Outputs false

    int x = 10;
    int y = 9;
    System.out.println(x > y);            // returns true

    // Or even easier:
    System.out.println(10 > 9);           // returns true

In the examples below, we use the **equal to** (`==`) operator to evaluate an expression: 

    int x = 10;
    System.out.println(x == 10);          // returns true

    System.out.println(10 == 15);         // returns false

## Real Life Example

Let's think of a "real life example" where we need to find out if a person is old enough to vote.

In the example below, we use the `>=` comparison operator to find out if the age (`25`) is **greater than** OR **equal to** the voting age limit, which is set to `18`:

    int myAge = 25;
    int votingAge = 18;
    System.out.println(myAge >= votingAge);

    