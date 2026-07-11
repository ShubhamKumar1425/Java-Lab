class NewThread extends Thread{
    NewThread(){
    super("Demo Thread");
    System.out.println("Child Thread: " + this);
    this.start();
}

public void run(){
    try{
        for(int i = 5; i > 0; i--){
            System.out.println("Child Thread: " + i);
            Thread.sleep(700);
        }
    } catch (InterruptedException e){
        System.out.println("Child Thread is Interrupted");
    }
    System.out.println("Child Thread is Exiting......");
}
}
class prog4{
    public static void main(String[] args){
        new NewThread();
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main Thread is Interrupted");
        }
        System.out.println("Main Thread is Exiting......");
    }
}
