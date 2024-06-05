package Arrays;
import java.util.*;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is a buzz number
        if (num % 10 == 7 || num % 7 == 0) { // Check if the number is divisible by 7 or ends with 7
            System.out.println(num + " is a buzz number.");
        } else {
            System.out.println(num + " is not a buzz number.");
        }
        
        scanner.close();
    }
}
