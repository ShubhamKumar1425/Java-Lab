class CounterThread extends Thread {
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        super(name); 
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public void run() {
        System.out.println("Thread - " + getName());
        System.out.print("Counter - ");
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(5); // 5-millisecond delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class prog1 {
    public static void main(String[] args) {
         
        String threadName = "First";
        int lowerRange = 10;
        int upperRange = 15;

        
        CounterThread counterThread = new CounterThread(threadName, lowerRange, upperRange);
        counterThread.start();
    }
}
