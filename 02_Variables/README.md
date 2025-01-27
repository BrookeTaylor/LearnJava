Title: Variables  
Author: Brooke Taylor  
Date: 01/26/2025  
Description: Variables!  

[w3schools.com](https://www.w3schools.com/java/java_variables.asp)


# Java Variables

In Java, there are different **types** of variables, for example: 

* `String` - stores text, "Hello World".
* `int` - stores integers. 1, 2, or 3. 
* `float` - stores floating point numbers with decimals.
* `char` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes.
* `boolean` - stores values with two states: true or false. 

## Declaring Variables

To create a variable, you must specify the type and assign it a value: 

        type variableName = value; 

> Where *type* is one of Java's types (such as `int` or `String`), and variableName is the name of the variable.

---

## Final Variables

If you don't want others (or yourself) to overwrite existing values, use the `final` keyword.

        final int myNum = 15;
        myNum = 20 // will generate an error: cannot assign a value to a final variable

---

## Other Types

A demonstration of how to declare variables of other types:

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

