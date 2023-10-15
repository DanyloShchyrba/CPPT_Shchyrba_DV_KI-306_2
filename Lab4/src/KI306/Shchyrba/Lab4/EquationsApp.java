package KI306.Shchyrba.Lab4;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * This class represents an application for calculating and storing equation results in a file.
 * It takes user input for a filename and calculates the result of an equation based on user input X.
 */
public class EquationsApp {
    /**
     * The main method of the application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        try {
            // Prompt the user to enter a file name.
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    Equations eq = new Equations();
                    // Prompt the user to enter the value of X.
                    out.print("Enter X: ");
                    int x = in.nextInt();
                    double result = eq.calculate(x);
                    out.println("Result: " + result);
                    fout.print(result);


                } finally {
                    // This block will be executed under all circumstances.
                    fout.flush();
                    fout.close();
                    in.close();
                }
            } catch (CalcException ex) {
                // Catch and handle calculation errors.
                out.print(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            // Catch and handle file-related errors, even if they occur in the finally block.
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}




