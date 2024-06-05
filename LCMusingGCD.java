package thursday;
import java.util.Scanner;
public class LCMusingGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Find the LCM using GCD
        int lcm = findLCM(num1, num2);
        
        // Print the LCM
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }

    // Function to find the GCD
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Function to find the LCM using GCD
    public static int findLCM(int num1, int num2) {
        return (num1 * num2) / findGCD(num1, num2);
    }
}








