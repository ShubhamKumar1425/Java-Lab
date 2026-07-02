import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Change case of the string");
            System.out.println("2. Reverse the string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert one string into another");
            System.out.println("5. Convert string to uppercase and lowercase");
            System.out.println("6. Check character presence and position");
            System.out.println("7. Check if string is palindrome");
            System.out.println("8. Count words, vowels, and consonants");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 9) break;
            
            System.out.print("Enter a String: ");
            String str = scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("The string after changing the case is: " + changeCase(str));
                    break;
                case 2:
                    System.out.println("The string after reversing is: " + new StringBuilder(str).reverse().toString());
                    break;
                case 3:
                    System.out.print("Enter the second string for comparison: ");
                    String str2 = scanner.nextLine();
                    System.out.println("The difference between ASCII values is: " + compareStrings(str, str2));
                    break;
                case 4:
                    System.out.print("Enter the string to be inserted into the first string: ");
                    String insertStr = scanner.nextLine();
                    System.out.println("The string after insertion is: " + str + " " + insertStr);
                    break;
                case 5:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;
                case 6:
                    System.out.print("Enter a character: ");
                    char ch = scanner.next().charAt(0);
                    scanner.nextLine(); 
                    int position = str.indexOf(ch);
                    if (position != -1) {
                        System.out.println("Position of entered character: " + position);
                    } else {
                        System.out.println("Entered character is not present");
                    }
                    break;
                case 7:
                    if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
                        System.out.println("Entered string is a palindrome");
                    } else {
                        System.out.println("Entered string is not a palindrome");
                    }
                    break;
                case 8:
                    countWordsVowelsConsonants(str);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static String changeCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
    
    public static int compareStrings(String s1, String s2) {
        return Math.abs(s1.compareTo(s2));
    }
    
    public static void countWordsVowelsConsonants(String s) {
        int vowels = 0, consonants = 0, words = s.split("\\s+").length;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
