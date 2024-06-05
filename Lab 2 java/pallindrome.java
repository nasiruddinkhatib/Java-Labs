package thursday;
import java.util.Scanner;

public class pallindrome {
    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        // Convert the number to a string
        String numStr = Integer.toString(num);
        
        // Reverse the string
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        return numStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Close the Scanner object
        sc.close();
        
        // Check if the number is palindrome or not and print the result
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
