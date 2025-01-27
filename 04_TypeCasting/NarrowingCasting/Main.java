/*
  Title: Java Data Types  
  Author: Brooke Taylor  
  Date: 01/26/2025  
  Description: Data Types!  
*/

public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;

    // Narrowing casting must be done manually by placing the type in parentheses () in front of the value
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
