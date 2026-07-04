import java.io.*;
import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the source file name: ");
            String sourceFile = scanner.nextLine();

            System.out.print("Enter the destination file name: ");
            String destinationFile = scanner.nextLine();

            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFile); // No append mode

            int byteData;
            while ((byteData = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteData);
            }

            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("File Copied Successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
