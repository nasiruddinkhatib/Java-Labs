package Arrays;
import java.util.*;
public class StateCapital {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	 // Declaring arrays to store states and capitals
	String[] states =  new String[10];
	String[] capitals =  new String[10];
	
	
	 // Accepting states and capitals
    System.out.println("Enter 10 states and their capitals:");
    for (int i = 0; i < 10; i++) {
        System.out.print("State: ");
        states[i] = scanner.next();
        System.out.print("Capital: ");
        capitals[i] = scanner.next();
    }
    // Asking user to enter a state to find its capital
    System.out.print("\nEnter the state whose capital is to be searched: ");
    String stateToSearch = scanner.next();

    // Searching for the state and displaying its capital if found
    boolean found = false;
    for (int i = 0; i < 10; i++) {
        if (states[i].equalsIgnoreCase(stateToSearch)) {
            System.out.println("The capital is " + capitals[i]);
            found = true;
            break;
        }
    }
    
 // Displaying a relevant message if state is not found
    if (!found) {
        System.out.println("State not found!");
    }

    scanner.close();
}

}

