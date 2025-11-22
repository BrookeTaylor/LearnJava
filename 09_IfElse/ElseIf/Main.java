/*
  Title: Java Else If
  Author: Brooke Taylor  
  Date: 01/27/2025  
  Description: The else if Statement!  
*/

// Use the else if statement to specify a new condition if 
// the first condition is false.

public class Main {
  public static void main(String[] args) {
    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 18) {
      System.out.println("Good day.");
    }  else {
      System.out.println("Good evening.");
    }
  }
}

/*

Example explained

In the example above, time (22) is greater than 10, so the first condition 
is false. The next condition, in the else if statement, is also false, 
so we move on to the else condition since condition1 and condition2 
is both false - and print to the screen "Good evening".

*/