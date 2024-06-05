package Arrays;
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaring arrays to store marks of 4 students for English, Maths, and Science
        int[] englishMarks = new int[40];
        int[] mathsMarks = new int[40];
        int[] scienceMarks = new int[40];
        
        // Accepting marks for English, Maths, and Science for each student
        for(int i = 0; i < 40; i++) {
            System.out.println("Enter marks for student " + (i+1) + ":");
            System.out.print("English: ");
            englishMarks[i] = scanner.nextInt();
            System.out.print("Maths: ");
            mathsMarks[i] = scanner.nextInt();
            System.out.print("Science: ");
            scienceMarks[i] = scanner.nextInt();
        }
        
        // Calculate and print average marks secured by each student
        System.out.println("\nAverage marks secured by each student:");
        for(int i = 0; i < 40; i++) {
            double average = (englishMarks[i] + mathsMarks[i] + scienceMarks[i]) / 3.0;
            System.out.println("Student " + (i+1) + ": " + average);
        }
        
        // Calculate and print class average in each subject
        double englishTotal = 0, mathsTotal = 0, scienceTotal = 0;
        for(int i = 0; i < 40; i++) {
            englishTotal += englishMarks[i];
            mathsTotal += mathsMarks[i];
            scienceTotal += scienceMarks[i];
        }
        double englishClassAverage = englishTotal / 40;
        double mathsClassAverage = mathsTotal / 40;
        double scienceClassAverage = scienceTotal / 40;
        
        System.out.println("\nClass average in each subject:");
        System.out.println("English: " + englishClassAverage);
        System.out.println("Maths: " + mathsClassAverage);
        System.out.println("Science: " + scienceClassAverage);
        
        scanner.close();
    }
}
