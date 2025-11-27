import java.util.Scanner;

public class Main {

    static void checkAge(int age) {
        if (age < 21) {
            System.out.println("Access denied.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int userAge = sc.nextInt();

        checkAge(userAge);

    }
}