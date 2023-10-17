package KI306.Shchyrba.Lab5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class represents calculations and file operations related to the result.
 */
class CalcWFio {
    /**
     * Write the result to a text file.
     *
     * @param fName The name of the text file to write to.
     * @throws FileNotFoundException If the specified file is not found.
     */
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ", result);
        f.close();
    }

    /**
     * Read the result from a text file.
     *
     * @param fName The name of the text file to read from.
     */
    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            } else {
                throw new FileNotFoundException("File " + fName + " not found");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Write the result to a binary file.
     *
     * @param fName The name of the binary file to write to.
     * @throws FileNotFoundException If the specified file is not found.
     * @throws IOException           If an I/O error occurs during file operations.
     */
    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    /**
     * Read the result from a binary file.
     *
     * @param fName The name of the binary file to read from.
     * @throws FileNotFoundException If the specified file is not found.
     * @throws IOException           If an I/O error occurs during file operations.
     */
    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    /**
     * Calculate the result based on the input value.
     *
     * @param x The input value for the calculation.
     */
    public void calculate(int x) {
        Equations eq = new Equations();
        result = eq.calculate(x);
    }

    /**
     * Get the current result.
     *
     * @return The current result.
     */
    public double getResult() {
        return result;
    }

    // Private field to store the result
    private double result;
}
