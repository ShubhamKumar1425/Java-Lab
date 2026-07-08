import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class prog5 {
   public prog5() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      try {
         System.out.print("Enter the file name: ");
         String var2 = var1.nextLine();
         File var3 = new File(var2);
         if (!var3.exists() || !var3.isFile()) {
            System.out.println("Error: The file '" + var2 + "' does not exist or is not a valid file.");
            return;
         }

         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         BufferedReader var7 = new BufferedReader(new FileReader(var3));

         String var8;
         try {
            while((var8 = var7.readLine()) != null) {
               ++var6;
               var4 += var8.length();
               var5 += var8.split("\\s+").length;
            }
         } catch (Throwable var17) {
            try {
               var7.close();
            } catch (Throwable var16) {
               var17.addSuppressed(var16);
            }

            throw var17;
         }

         var7.close();
         System.out.println("No. of characters: " + var4);
         System.out.println("No. of lines: " + var6);
         System.out.println("No. of words: " + var5);
      } catch (FileNotFoundException var18) {
         System.out.println("Error: File not found. Please check the file path.");
      } catch (IOException var19) {
         System.out.println("Error: Unable to read the file. " + var19.getMessage());
      } finally {
         var1.close();
      }

   }
}
