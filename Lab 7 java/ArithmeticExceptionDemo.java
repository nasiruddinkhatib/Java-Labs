package lab30_5_24;

import java.util.Scanner;

// Wap to show an Arithmetic exception in a program
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int quotient = 0;
        System.out.print("Enter a dividend - ");
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();

        System.out.print("Enter a divisor - ");
        int divisor = sc.nextInt();

        try {
            quotient = dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Quotient - " + quotient);
        sc.close();
    }
}
