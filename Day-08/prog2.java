class Printer {
    synchronized void print(String[] words) {
        for (String word : words) {
            System.out.println(Thread.currentThread().getName() + " - " + word);
            try {
                Thread.sleep(100); // Adding some delay for demonstration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    Printer printer;
    String[] words;

    MyThread(Printer p, String[] w) {
        printer = p;
        words = w;
    }

    public void run() {
        printer.print(words);
    }
}

public class prog2 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] words1 = {"I", "Love", "Java", "Very", "Much"};
        String[] words2 = {"I", "Love", "Java", "Very", "Much"};

        MyThread thread1 = new MyThread(printer, words1);
        MyThread thread2 = new MyThread(printer, words2);

        thread1.start();
        thread2.start();
    }
}
