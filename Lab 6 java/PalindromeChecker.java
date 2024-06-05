package String;
import java.util.*;
public class PalindromeChecker {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a string
	        System.out.println("Enter a string to check if it is a palindrome:");
	        String input = scanner.nextLine();
	        
	        // Check if the input string is a palindrome
	        boolean isPalindrome = checkPalindrome(input);
	        
	        // Output the result
	        if (isPalindrome) {
	            System.out.println("The string \"" + input + "\" is a palindrome.");
	        } else {
	            System.out.println("The string \"" + input + "\" is not a palindrome.");
	        }
	        
	        // Close the scanner
	        scanner.close();
	    }
	    
	    // Method to check if a string is a palindrome
	    public static boolean checkPalindrome(String str) {
	        // Remove spaces and convert the string to lowercase for accurate comparison
	        str = str.replaceAll("\\s+", "").toLowerCase();
	        
	        // Initialize pointers for the start and end of the string
	        int left = 0;
	        int right = str.length() - 1;
	        
	        // Compare characters from both ends towards the center
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; // If characters don't match, it's not a palindrome
	            }
	            left++;
	            right--;
	        }
	        
	        return true; // If all characters match, it's a palindrome
	    }
	

	}


