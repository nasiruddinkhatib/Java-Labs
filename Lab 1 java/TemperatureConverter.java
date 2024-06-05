import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // Display menu options
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt(); // Read user's choice
        
        double temperature, convertedTemperature;
        
        // Check the user's choice and perform conversion accordingly
        if (choice == 1) {
            // Convert Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + convertedTemperature);
        } else if (choice == 2) {
            // Convert Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            temperature = scanner.nextDouble();
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } else {
            // Display error message for invalid choice
            System.out.println("Invalid choice");
        }
        
        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}
