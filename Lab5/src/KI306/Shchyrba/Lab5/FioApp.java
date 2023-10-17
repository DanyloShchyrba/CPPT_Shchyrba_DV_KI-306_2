package KI306.Shchyrba.Lab5;

import java.io.*;
import java.util.*;

/**
 * This class represents the main application for performing calculations and file operations.
 */
public class FioApp {
    /**
     * The main entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     * @throws FileNotFoundException If a file is not found during file operations.
     * @throws IOException           If an I/O error occurs during file operations.
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Create an instance of CalcWFio
        CalcWFio obj = new CalcWFio();

        // Create a scanner to read user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter data
        System.out.print("Enter X: ");
        int data = s.nextInt();

        // Perform calculations using the CalcWFio object
        obj.calculate(data);

        // Display the result to the console
        System.out.println("Result is: " + obj.getResult());

        // Write the result to a text file
        obj.writeResTxt("textRes.txt");

        // Write the result to a binary file
        obj.writeResBin("BinRes.bin");

        // Read the result from the binary file
        obj.readResBin("BinRes.bin");

        // Display the result after reading from the binary file
        System.out.println("Result is: " + obj.getResult());

        // Read the result from the text file
        obj.readResTxt("textRes.txt");

        // Display the result after reading from the text file
        System.out.println("Result is: " + obj.getResult());
        
        s.close();
    }
}


