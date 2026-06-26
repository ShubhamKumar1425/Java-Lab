import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] numbers = new int[size];
                        
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }
            System.out.print("Enter an index to access: ");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds!");
        } finally {
            sc.close();
        }
        
    }
}
