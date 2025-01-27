/*
  Title: Java Data Types  
  Author: Brooke Taylor  
  Date: 01/26/2025  
  Description: Data Types!  
*/

public class Main {
  public static void main(String[] args) {
    // Set the maximum possible score in the game to 500
    int maxScore = 500;

    // The actual score of the user
    int userScore = 423;

    /* Calculate the percantage of the user's score in relation to the maximum available score.
    Convert userScore to float to make sure that the division is accurate */
    float percentage = (float) userScore / maxScore * 100.0f;

    // Print the result
    System.out.println("User's percentage is " + percentage);
  }
}
