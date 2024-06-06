package basic;
import java.util.Scanner;

public class markscompare {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter marks in English
        System.out.println("Enter marks obtained in English:");
        int englishMarks = scanner.nextInt();
        
        // Prompt the user to enter marks in Maths
        System.out.println("Enter marks obtained in Maths:");
        int mathsMarks = scanner.nextInt();
        
        // Prompt the user to enter marks in Science
        System.out.println("Enter marks obtained in Science:");
        int scienceMarks = scanner.nextInt();
        
        // Check eligibility of different streams 
        if (englishMarks >= 80 && mathsMarks >= 80 && scienceMarks >= 80) {
            // If marks in English, Maths, and Science are all 80 or above
            System.out.println("Stream Allotted: Pure Science");
        } else if (englishMarks >= 80 && scienceMarks >= 80 && mathsMarks >= 60) {
            // If marks in English and Science are 80 or above and marks in Maths are 60 or above
            System.out.println("Stream Allotted: Bio. Science");
        } else if (englishMarks >= 60 && mathsMarks >= 60 && scienceMarks >= 60) {
            // If marks in English, Maths, and Science are all 60 or above
            System.out.println("Stream Allotted: Commerce");
        } else {
            // If not eligible for any stream
            System.out.println("Sorry, you are not eligible for any stream.");
        }
        
        // Close the Scanner object
        scanner.close();
    }
}
