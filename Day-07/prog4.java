import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class prog4 {
   public ex4() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      try {
         System.out.print("Enter the first binary file name: ");
         String var2 = var1.nextLine();
         System.out.print("Enter the second binary file name: ");
         String var3 = var1.nextLine();
         FileInputStream var4 = new FileInputStream(var2);
         FileInputStream var5 = new FileInputStream(var3);
         int var6 = 0;
         boolean var9 = true;

         int var7;
         int var8;
         while((var7 = var4.read()) != -1 && (var8 = var5.read()) != -1) {
            ++var6;
            if (var7 != var8) {
               var9 = false;
               System.out.println("Two files are not equal: byte position at which two files differ is " + var6);
               break;
            }
         }

         if (var9 && var4.read() == -1 && var5.read() == -1) {
            System.out.println("Two files are equal");
         } else if (var9) {
            System.out.println("Two files are not equal: one file is longer than the other.");
         }

         var4.close();
         var5.close();
      } catch (IOException var10) {
         System.out.println("An error occurred: " + var10.getMessage());
      }

      var1.close();
   }
}
