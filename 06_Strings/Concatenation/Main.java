/*
  Title: Java String Concatenation
  Author: Brooke Taylor  
  Date: 01/27/2025  
  Description: String Concatenation!  
*/

public class Main {
  public static void main(String args[]) {

    // The + operator can be used between strings to combine them. 
    String firstName = "Brooke";
    String lastName = "Taylor";

    System.out.println(firstName + " " + lastName);

    // You can also use the concat() method to concatenate two strings: 
    System.out.println(firstName.concat(lastName));
  }
}
