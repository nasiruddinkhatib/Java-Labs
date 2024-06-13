package lab_6_6_24;   
import java.util.*;
public class RemoveEvenNumber {
	 public static void main(String[] args) {
	        // Create an ArrayList to hold numbers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add numbers to the ArrayList
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(6);
	        numbers.add(7);
	        numbers.add(8);
	        numbers.add(9);
	        numbers.add(10);

	        // Display original list
	        System.out.println("Original List: " + numbers);

	        // Remove even numbers from the ArrayList
	        removeEven(numbers);

	        // Display modified list
	        System.out.println("List after removing even numbers: " + numbers);
	    }

	    // Method to remove even numbers from ArrayList
	    public static void removeEven(ArrayList<Integer> list) {
	        // Iterate through the list backwards to avoid index shifting
	        for (int i = list.size() - 1; i >= 0; i--) {
	            if (list.get(i) % 2 == 0) {
	                list.remove(i);
	            }
	        }
}
}

