package Arrays;
import java.util.Scanner;
public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Calculate square of the number
        int square = n * n;

        // Count the number of digits in the original number
        int d = (int) Math.log10(n) + 1;

        // Split the square into two pieces
        int right = square % (int) Math.pow(10, d);
        int left = square / (int) Math.pow(10, d);

        // Check if the sum of the two pieces is equal to the original number
        if (right + left == n) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is not a Kaprekar number.");
        }

        scanner.close();
    }
}
