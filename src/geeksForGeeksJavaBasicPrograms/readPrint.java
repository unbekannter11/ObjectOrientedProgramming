package src.geeksForGeeksJavaBasicPrograms;

import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/how-to-read-and-print-an-integer-value-in-java/?ref=lbp
 */

public class readPrint {
    public static void main(String[] args) {

        // Declares the variables
        int num;

        // Input the Integer
        System.out.println("Enter the integer: ");

        // Crate Scanner object
        Scanner s = new Scanner(System.in);

        // Read the next integer from the screen
        num = s.nextInt();

        // Display the Integer
        System.out.println("Entered the integer: " + num);



    }
}
