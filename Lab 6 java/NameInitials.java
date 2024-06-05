package String;
import java.util.*;
public class NameInitials {
public static void main(String[]args)
{
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Enter a name (Containing three words ):");
	String name =scanner.nextLine();
	 // Call the method to get initials and store the result
	String initials = getInitials(name);
	  // Display the initials
    System.out.println("Initials: " + initials);
    
    // Close the scanner
    scanner.close();
	}
// Method to get initials from a name containing three words
	public static String getInitials(String name) {
    // Split the name into words using space as delimiter
    String[] words = name.split(" ");
    
    // Initialize a StringBuilder to build the initials
    StringBuilder initials = new StringBuilder();
    
    // Iterate over each word and append its first character to the initials
    for (String word : words) {
        if (!word.isEmpty()) {
            initials.append(word.charAt(0));
        }
    }
    
    // Return the initials as a string
    return initials.toString();
}
}
    
