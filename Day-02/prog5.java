import java.util.*;
public class prog5 {

    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner sc=new Scanner(System.in);
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
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
               }
            }

        }
        System.out.println("The ascending order is ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
        }

     sc.close();
    
    }
}
    
