package String;
import java.util.Arrays;
import java.util.Scanner;

public class StringArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int numberOfStrings = sc.nextInt();
        sc.nextLine(); // Consume the newline

        String[] strings = new String[numberOfStrings];

        System.out.println("Enter the strings:");
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        Arrays.sort(strings);

        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        sc.close();
    }
}
