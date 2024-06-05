package String;
import java.util.*;
public class RemoveVowels {
public static void main(String[]args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String input =sc.nextLine();
String result = removeVowels(input);
System.out.println("String after removing vowels: " + result);

// Close the scanner
sc.close();
}

// Method to remove vowels from the input string
public static String removeVowels(String str) {
// Create a StringBuilder to build the result string
StringBuilder sb = new StringBuilder();

// Convert the input string to uppercase to handle both cases
str = str.toUpperCase();

// Iterate over each character in the string
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    
    // Check if the character is not a vowel
    if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
        // Append the character to the result
        sb.append(ch);
    }
}

// Return the result as a string
return sb.toString();
}
}

