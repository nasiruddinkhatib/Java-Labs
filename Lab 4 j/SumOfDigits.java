package Arrays;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int twoDigitSum = 0; // Corrected variable name
        int threeDigitSum = 0; // Corrected variable name

        System.out.println("Enter 10 integers");

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num >= 10 && num <= 99) {
                twoDigitSum += num;
            } else if (num >= 100 && num <= 999) {
                threeDigitSum += num; // Corrected variable name
            }
        }
        System.out.println("Sum of two Digit numbers: " + twoDigitSum);
        System.out.println("Sum of Three Digit numbers: " + threeDigitSum); // Corrected variable name

        scanner.close();
    }
}
