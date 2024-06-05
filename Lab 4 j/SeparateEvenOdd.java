package Arrays;
import java.util.*;
public class SeparateEvenOdd {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	int [] arr = new int[20];  //Array to store 20 numbers
	int [] even = new int[20]; // Array for storing Even Numbers
	int [] odd = new int[20]; //Array to Store odd number 
	// counters to keep track of even and odd numbers 
	int evenCount = 0;
	int oddCount = 0;
	// Accepting 20 numbers from the users
	System.out.println("enter the 20 numbers");
	for(int i=0; i<20;i++) {
		arr[i] = scanner.nextInt();	
		if(arr[i] % 2 == 0) {
			even[evenCount++] = arr[i];
		}
		else {
			odd[oddCount++] = arr[i];
		}
	}
	  // Printing even numbers
    System.out.println("Even numbers:");
    for(int i = 0; i < evenCount; i++) {
        System.out.print(even[i] + " ");
    }
    // Printing odd numbers
    System.out.println("\nOdd numbers:");
    for(int i=0; i< oddCount;i++) {
    	System.out.println(odd[i] +"");
    }
    scanner.close();  //closing  the scanner 
}
}
