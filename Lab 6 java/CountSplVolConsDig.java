package String; 
import java.util.*; // Imports the util package which includes Scanner

public class CountSplVolConsDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        String str;
        int vol = 0, spl = 0, dig = 0, word = 0; // Initialize counters for vowels, special characters, digits, and words
        
        System.out.println("Enter The String");
        str = sc.nextLine(); // Read the input string from the user
        str = str.toLowerCase(); // Convert the string to lowercase for uniformity
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vol++;
            
            // Check if the character is a digit
            if (ch >= '0' && ch <= '9')
                dig++;
            
            // Check if the character is a space (to count words)
            if (ch == ' ')
                word++;
            
            // Check if the character is a special character (not a letter, digit, or whitespace)
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))
                spl++;
        }
        
        // Increment word count by 1 because the number of words is spaces + 1
        word++;
        
        // Print the counts
        System.out.println("The number of vowels are " + vol);
        System.out.println("The number of digits are " + dig);
        System.out.println("The number of words are " + word);
        System.out.println("The number of special characters are " + spl);
    }
}
