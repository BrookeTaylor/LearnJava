/*
  Title: Java Math
  Author: Brooke Taylor  
  Date: 01/27/2025  
  Description: Basic Math!  
*/

public class Main {
  public static void main(String args[]) {

    System.out.println("\nThe Math.max(x, y) method can be used to find the highest value of x and y:");
    System.out.println(Math.max(5, 10));


    System.out.println("\nThe Math.min(x, y) method can be used to find the lowest value of x and y:");
    System.out.println(Math.min(5, 10));

    System.out.println("\nThe Math.sqrt(x) method returns the square root of x:");
    System.out.println(Math.sqrt(64));

    System.out.println("\nThe Math.abs(x) method returns the absolute (positive) value of x:");
    System.out.println(Math.abs(-4.7));

    System.out.println("\nMath.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):");
    System.out.println(Math.random());

    System.out.println("\nTo get more control over the random number, for example, if you only want a random number between 0 and 100:");
    int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println(randomNum);

  }
}
