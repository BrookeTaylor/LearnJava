import java.util.Scanner;
import java.util.Random;

public class Main {

    // Method for Computer Choice
    public static String getCompChoice() {
        Random random = new Random();
        int num = random.nextInt(3);

        if (num == 0) return "rock";
        if (num == 1) return "paper";
        return "scissors";
    }


    // Method to determine winner
    public static String Winner(String player, String computer) {

        if (player.equals(computer)) {
            return "It's a tie!";
        } else if (
                (player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper"))
        ) {
            return "You win!";
        } else {
            return "Computer wins!";
        }

    }




    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String playerChoice;

        System.out.println("=== ROCK PAPER SCISSORS ===");
        System.out.println("Type 'quit' to exit.\n");

        while (true) {
            System.out.print("Enter rock, paper, or scissors: ");
            playerChoice = userInput.nextLine().toLowerCase();

            if (playerChoice.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")) {
                System.out.println("Invalid input. Try again. \n");
                continue;
            }

            String computer = getCompChoice();
            System.out.println("Computer chose: "+ computer);

            System.out.println(Winner(playerChoice, computer));
            System.out.println();
        }
        userInput.close();
    }
}