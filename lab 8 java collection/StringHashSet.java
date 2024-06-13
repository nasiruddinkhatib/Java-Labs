package lab_6_6_24;
import java.util.HashSet;
import java.util.Scanner;
public class StringHashSet {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create a HashSet to store strings
	        HashSet<String> stringSet = new HashSet<>();

	        // Input 10 strings
	        System.out.println("Enter 10 strings:");
	        for (int i = 0; i < 10; i++) {
	            String input = scanner.nextLine();
	            stringSet.add(input);
	        }

	        // Input string to search
	        System.out.println("Enter a string to search:");
	        String searchString = scanner.nextLine();

	        // Check if the string is present in the set
	        if (stringSet.contains(searchString)) {
	            System.out.println("The string '" + searchString + "' is found in the set.");
	        } else {
	            System.out.println("The string '" + searchString + "' is not found in the set.");
	        }

	        scanner.close();
	    }
	}
