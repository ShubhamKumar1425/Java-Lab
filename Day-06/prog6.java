import java.util.Scanner;

class NegativeNumberException extends Exception {
    int ex;

    public NegativeNumberException(int p) {
        super("Caught a negative value: " + p);
        ex = p;
    }

    @Override
    public String toString() {
        return "Caught an negative value: " + ex;
    }
}

public class prog6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        try {
            check(n);
        } catch (NegativeNumberException n1) {
            System.out.println("Caught the exception: " + n1); 
        }
    }

    public static void check(int k) throws NegativeNumberException {
        if (k > 0)
            System.out.println(k);
        else
            throw new NegativeNumberException(k);
    }
}
