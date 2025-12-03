// import ArrayList for question 5.
import java.util.ArrayList;

public class Main {


    /*
        Question 6:

        Create a class Book under your Main class.

        It should have:

            * a field: String title

            * a constructor that sets the title

            * a toString() override that returns:
                "Book: " + title"
    */
    public static class Book {
        // fields
        String title;

        // constructor
        public Book(String title) {
            this.title = title;
        }

        // toString Override
        @Override
        public String toString() {
            return "Book Title: " + title;
        }
    }

    public static void main(String[] args) {


        // Question 1
        // Write a for loop that prints the numbers 1 through 5.
        System.out.println("\nLoop 1-5\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // Question 2
        // Write a while loop that prints the numbers 5 down to 1.
        System.out.println("\nCount down 5-1\n");
        int a = 5;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }


        /*
            Question 3.

             Write a switch statement that prints the name of the day based on a number.

            Requirements:
                * Create an int day = 3;
                * Use a switch(day) statement
                * Print "Wednesday" if the day is 3
                * Include cases for 1–7
                * Include a default for invalid numbers
         */

        System.out.println("\nPrint day 3.\n");
        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid choice!");
        }


        /*
            Question 4.

            Create an array and print one element.

            Task:
                * Create a String[] colors array with the values:
                    "red", "green", "blue", "yellow"
                * Print the first element of the array.
        */
        System.out.print("\nPrint \"red\", from an array.\n");
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors[0]);



        /*
            Question 5.

            Create an ArrayList<String> called fruits.

            * Add these three items to it:
                "apple", "banana", "cherry"

            * Print the entire list.
                (Just System.out.println(fruits); is fine.)
        */
        System.out.println("\nPrinting fruits!");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println(fruits);



        /*
            Question 6.

            * Inside main, create a Book object with the title "Java Review".
            * Print the book object.
        */
        Book java = new Book("Java Review");
        System.out.println(java);
    }
}