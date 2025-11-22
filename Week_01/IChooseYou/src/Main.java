import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a color:");
        System.out.println("1. Red");
        System.out.println("2. Blue");
        System.out.println("3. Green");
        System.out.println("4. Yellow");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("I choose you, Charmander!");
                break;

            case 2:
                System.out.println("I choose you, Squirtle!");
                break;

            case 3:
                System.out.println("I choose you, Bulbasaur!");
                break;

            case 4:
                System.out.println("I choose you, Pikachu!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();

    }
}