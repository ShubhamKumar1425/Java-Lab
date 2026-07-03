import java.io.*;
import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Subject: ");
            String subject = scanner.nextLine();
            
            System.out.print("Enter Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter the name of the file to store details: ");
            String fileName = scanner.nextLine();
            
            FileWriter writer = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(rollNo + ", " + name + ", " + subject + ", " + marks);
            bufferedWriter.newLine();
            bufferedWriter.close();
            
            System.out.println("Student details saved successfully.");
            
            System.out.println("Displaying the content of the file:");
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        scanner.close();
    }
}
