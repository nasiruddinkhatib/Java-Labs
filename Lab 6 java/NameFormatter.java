package String;
import java.util.*;
public class NameFormatter {
	 public static void main(String[] args) {
	        // Create a Scanner object to read input from the console
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a name containing three words
	        System.out.println("Enter a name (containing three words):");
	        String name = scanner.nextLine();
	        
	        // Call the method to format the name and store the result
	        String formattedName = formatName(name);
	        
	        // Display the formatted name
	        System.out.println("Formatted Name: " + formattedName);
	        
	        // Close the scanner
	        scanner.close();
	    }
	    
	    // Method to format the name
	    public static String formatName(String name) {
	        // Split the name into words using space as delimiter
	        String[] words = name.split(" ");
	        
	        // Create a StringBuilder to build the formatted name
	        StringBuilder formattedName = new StringBuilder();
	        
	        // Append the last word (surname) to the formatted name
	        formattedName.append(words[words.length - 1]);
	        
	        // Append a space
	        formattedName.append(" ");
	        
	        // Append the remaining words (first and middle names) to the formatted name
	        for (int i = 0; i < words.length - 1; i++) {
	            formattedName.append(words[i]);
	            // Append a space after each word, except for the last one
	            if (i < words.length - 2) {
	                formattedName.append(" ");
	            }
	        }
	        
	        // Return the formatted name as a string
	        return formattedName.toString();
	    }
	}

