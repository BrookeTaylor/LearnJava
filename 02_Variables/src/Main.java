/*
    Title: Variables
    Author: Brooke Taylor
    Date: 01/06/2025
    Description: Variables!
*/

public class Main {
    public static void main(String[] args) {

        // Create a variable called name of type String and assign it a value.
        String name = "Java is fun and easy.";

        // To create a variable that should store a number
        int myNum = 3;

        // Then we use println() to print the variables
        System.out.println(name);
        System.out.println(myNum);



        /*  Display Variables  */
        String firstName = "Brooke ";
        String lastName = "Taylor";

        String fullName = firstName + lastName;

        System.out.println(fullName);



        // For numeric values, the + character works as a mathematical operator:
        int x = 5;
        int y = 6;

        System.out.println(x + y);


        // To declare more than one variable of the same type, you can use a comma-separated list.
        int a = 1, b = 2, c = 3;

        System.out.println(a + b + c);

    }
}
