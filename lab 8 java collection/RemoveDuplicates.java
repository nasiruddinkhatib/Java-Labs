package lab_6_6_24;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // ArrayList to store user-entered elements (may contain duplicates)
        ArrayList<String> listWithDuplicates = new ArrayList<>();

        // Prompt user to enter elements until "done" is entered
        System.out.println("Enter elements (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            // Add user-entered element to the ArrayList
            listWithDuplicates.add(input);
        }

        System.out.println("Original ArrayList: " + listWithDuplicates);

        // New ArrayList to store elements without duplicates
        ArrayList<String> listWithoutDuplicates = new ArrayList<>();

        // Loop through each element in the original ArrayList
        for (String item : listWithDuplicates) {
            // Check if the current element is not already present in the new list
            if (!listWithoutDuplicates.contains(item)) {
                // If not present, add the element to the new list
                listWithoutDuplicates.add(item);
            }
        }

        System.out.println("ArrayList without duplicates: " + listWithoutDuplicates);

        // Close the Scanner object to avoid resource leaks
        scanner.close();
    }
}
