Title: Java Switch Statements  
Author: Brooke Taylor  
Date: 01/27/2025  
Description: Switch Statements

[w3schools.com](https://www.w3schools.com/java/java_switch.asp)

# Switch Statements

Instead of writing **many** `if...else` statements, you can use the `switch` statement. 

The `switch` statement selects one of many code blocks to be executed: 

    switch(expression){
      case x:
        // code block
        break;
      case y:
        // code block
        break;
      default:
        // code block
    }

This is how it works: 

* The `switch` expression is evaluated once.
* The value of the expression is compared with the values of each `case`.
* If there is a match, the associated block of code is executed.
* The `break` and `default` keywords are optional. 