import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            ProcessInput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: NegativeNumberException: " + e.getMessage());
        }
    }

    public static void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0)
            throw new NegativeNumberException("Number should be positive.");
        else
            System.out.println("Double value: " + (num * 2));
    }
}

