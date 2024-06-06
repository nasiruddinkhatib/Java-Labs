package basic;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accepting employee name
        System.out.println("Enter the name of the employee:");
        String name = scanner.nextLine();
        
        // Accepting annual income
        System.out.println("Enter the annual income of the employee:");
        double income = scanner.nextDouble();
        
        // Calculating income tax
        double tax = 0;
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.1 * (income - 250000);
        } else if (income <= 1000000) {
            tax = 30000 + 0.2 * (income - 500000);
        } else {
            tax = 50000 + 0.3 * (income - 1000000);
        }
        
        // Displaying employee name and income tax
        System.out.println("Name: " + name);
        System.out.println("Income Tax: ₹" + tax);
        
        scanner.close();
    }
}
