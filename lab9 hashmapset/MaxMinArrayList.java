package lab13_6_24; // package name

import java.util.ArrayList; // Import the ArrayList 
import java.util.Collections; // Import the Collections utility class

public class MaxMinArrayList { // Define the main class
    public static void main(String[] args) { // Define the main method
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add elements to the ArrayList
        numbers.add(2);
        numbers.add(8);
        numbers.add(16);
        numbers.add(20);
        numbers.add(6);
        numbers.add(4);
        numbers.add(26);
        numbers.add(1);

        // Find the maximum element in the ArrayList
        int max = Collections.max(numbers);

        // Find the minimum element in the ArrayList
        int min = Collections.min(numbers);

        // Print the maximum and minimum elements
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
