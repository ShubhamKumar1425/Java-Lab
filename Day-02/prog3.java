import java.util.*;
public class prog3{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
               if(arr[j]>arr[j+1])
               {
                 //swap
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
               }
            }

        }
        int count=1;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            System.out.println("The number of occurence of "+arr[i]+"is : "+count);
            i+=count-1;
            count=1;
        }

    
    }
}
