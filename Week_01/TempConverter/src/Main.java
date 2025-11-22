import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = scanner.nextDouble();
            double c = (f - 32) * 5.0 / 9.0;
            System.out.println("Celsius: " + c);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double c = scanner.nextDouble();
            double f = (c * 9.0 / 5.0) + 32;
            System.out.println("Fahrenheit: " + f);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
