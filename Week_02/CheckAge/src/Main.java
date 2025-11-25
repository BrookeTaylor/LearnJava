public class Main {

    /*
    Using void keyword, which indicates the method should not return a value.
    */
    static void checkAge(int age) {

        if (age < 18) {
            System.out.println("Access denied.");
        } else {
            System.out.println("Access granted.");
        }

    }

    public static void main(String[] args) {

        System.out.println("\nAge is 20.");
        checkAge(20);

        System.out.println("\nAge is 17.");
        checkAge(17);

    }
}