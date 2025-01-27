/*
    Title: Hello World
    Author: Brooke Taylor
    Date: 01/06/2025
    Description: First Java file!
*/

// The main() method is required and you will see it in every Java program:
public class Main {

    // For now, just remember that every Java program has a class name which must match the filename,
    // and that every program must contain the main() method.
    public static void main(String[] args) {

        // System is a built-in Java class that contains useful members, such as out, which is short for "output".
        // The println() method, short for "print line", is used to print a value to the screen (or a file).
        System.out.println("\nHello World!");

        // You can add as many println() methods as you want. Note that it will add a new line for each method:
        // Text must be wrapped inside double quotations marks "".

        // By using \n, you control when line breaks occur, whether within print() or println() statements.
        System.out.println("I'm learning Java!\n");

        // There is also a print() method, which is similar to println().
        //The only difference is that it does not insert a new line at the end of the output:
        System.out.print("System.out.print! ");
        System.out.print("I will print on the same line.\n\n");


        // Unlike text, we don't put numbers inside double quotes:
        // You can also perform mathematical calculations inside the println() method:
        System.out.println(3 + 3);

    }
}

