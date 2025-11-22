/*
  Title: Java Short Hand If Else
  Author: Brooke Taylor  
  Date: 01/27/2025  
  Description: The else if Statement!  
*/

/*

Short Hand if...else


There is also a short-hand if else, which is known as the ternary operator 
because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and 
is most often used to replace simple if else statements:


variable = (condition) ? expressionTrue : expressionFalse; 

*/

/*

Instead of writing


int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

You can simply write:
*/

public class Main {
  public static void main(String[] args) {   
    int time = 20;
    String result;
    result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
  }
}
