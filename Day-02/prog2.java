public class prog2 {
    public static void main(String[] args) {
        
        int evenCount = 0;
        int oddCount = 0;

        int arr[]= new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i]=Integer.parseInt(args[i]);
            if (arr[i]% 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}    
