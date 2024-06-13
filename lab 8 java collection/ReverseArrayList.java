package lab_6_6_24;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> num = new ArrayList<>(); // Create an ArrayList to store integers
        
        // Adding elements to the ArrayList
        num.add(1); // Add element 1to the list
        num.add(2); 
        num.add(3); 
        num.add(4); 
        num.add(5); 
        num.add(6); 
        
        // Display the original list
        System.out.println("Original list: " + num);
        
        // Now we will reverse the list
        System.out.println("Reverse List: " + num); // Printing the list before reversing it
    }
    
    // Method to reverse the ArrayList 
    public static void reverseArrayList(ArrayList<Integer> list) {
        int size = list.size(); // Get the size of the list
        
        // Iterate through the first half of the list
        for (int i = 0; i < size / 2; i++) {
            // Swap elements at index i with corresponding element from the end of the list
            int temp = list.get(i); // Store the current element in a temporary variable
            list.set(i, list.get(size - 1 - i)); // Set current element to its corresponding element from the end
            list.set(size - 1 - i, temp); // Set corresponding element from the end to the temporary variable
        }
    }
}
