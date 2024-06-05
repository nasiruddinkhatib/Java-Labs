package thursday;
import java.util.Scanner;
public class scondhvlaue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Create an array of the given size
        int[] array = new int[size];
        
        // Input array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        // Find the second highest element
        int secondHighest = findSecondHighest(array);
        
        // Print the second highest element
        System.out.println("The second highest element in the array is: " + secondHighest);
        
        sc.close();
    }
    
    public static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        // Find the highest and second highest elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest && array[i] != highest) {
                secondHighest = array[i];
            }
        }
        
        return secondHighest;
    }
}
