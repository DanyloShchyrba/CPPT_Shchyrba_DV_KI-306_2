import java.io.*;
import java.util.*;

/**
 * This class generates a square matrix with a diagonal pattern of characters
 * and writes it to a text file.
 * @author Shchyrba Danylo
 * @version 1.0
 * @since version 1.0
 */
public class Lab1ShchyrbaKI306 {

    /**
     * The main method of the program.
     * 
     * @param args Command line arguments (not used in this program).
     * @throws FileNotFoundException If the specified file cannot be created.
     */
    public static void main(String[] args) throws FileNotFoundException {
        int size;
        char[][] arr;
        String filler;

        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter the size of the square matrix: ");
        size = in.nextInt();
        in.nextLine();

        arr = new char[size][];

        System.out.print("\nEnter the filler character: ");
        filler = in.nextLine();

        int mid = size / 2;
        int lastIndex = size - 1;
        
        
        
        for (int i = 0; i <= mid; i++) {
        	
            arr[i] = new char[size];
            Arrays.fill(arr[i], ' ');
            for (int j = lastIndex; j >= lastIndex - i; j--) {
                arr[i][j] = (char) filler.codePointAt(0);
            }        
        }

        for (int i = mid + 1; i < size; i++) {
            arr[i] = new char[size];
            Arrays.fill(arr[i], ' ');
            for (int j = lastIndex; j >= i; j--) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
        }

        for (char[] chArr : arr) {
            for (char ch : chArr) {
                System.out.print(ch + " ");
                fout.print(ch + " ");
            }
            System.out.println();
            fout.println();
        }

        fout.flush();
        fout.close();
        in.close();
    }
}