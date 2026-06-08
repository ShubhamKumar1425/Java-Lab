public class prog4 {
    static int count=0;
    prog4()
    {
       count++;
    }
    void  display()
    {
        System.out.println("Number of objects is ="+count);
    }

    public static void main(String[] args) {

        prog4 l1=new prog4();
        prog4 l2=new prog4();

        l1.display();
    }
}       
