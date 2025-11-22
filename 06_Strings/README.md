Title: Java Strings  
Author: Brooke Taylor  
Date: 01/27/2025  
Description: Operators

[w3schools.com](https://www.w3schools.com/java/java_strings.asp)

# Strings

Strings are used for storing text. 

A `String` variable contains a collection of characters surrounded by double quotes.

    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of this txt string is: " + txt.length());

## More String Methods

    String txt = "Hello World";
    System.out.println(txt.toUpperCase());      //Outputs "HELLO WORLD"
    System.out.println(txt.toLowerCase());      // Outputs "hello world"

## Finding a Character in a String

The `indexOf()` method returns the **index** (the position) of the first occurrence of a specified text in a string (including whitespace):

    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate")); // Outputs 7

> Java counts positions from zero.  
0 is the first position in a string, 1 is the second, 2 is the third...

## Special Characters

Because strings must be written within quotes, Java will misunderstand this string, and generate an error: 

    String txt = "We are the so-called "Vikings" from the north.";

The solution to avoid this problem, is to use the **backslash escape character**.

The backslash (`\`) escape character turns special characters into string characters: 

| Escape character | Result | Description |
| ----------- | ----------- | ----------- |
| \\' | ' | Single quote |
| \\" | " | Double quote |
| \\ | \ | Backslash |

> Note: If viewing the markdown (`.md`) file, I had to escape out of the \ to add to correct character in view mode.

Other common escape sequences that are valid in Java are: 

| Code | Result | 
| ----------- | ----------- | 
| \n | New Line | 
| \r | Carriage Return | 
| \t | Tab | 
| \b | Backspace | 
| \f | Form Feed | 


