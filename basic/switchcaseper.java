package basic;
import java.util.*;

public class switchcaseper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the shape (1 for square, 2 for rectangle, 3 for triangle):");
        int ch = sc.nextInt();
        
        int perimeter = 0;
        
        switch(ch) {
            case 1: // Square
                System.out.println("Enter the side length of the square:");
                int side = sc.nextInt();
                perimeter = 4 * side;
                break;
            case 2: // Rectangle
                System.out.println("Enter the length of the rectangle:");
                int length = sc.nextInt();
                System.out.println("Enter the width of the rectangle:");
                int width = sc.nextInt();
                perimeter = 2 * (length + width);
                break;
            case 3: // Triangle
                System.out.println("Enter the length of side 1 of the triangle:");
                int side1 = sc.nextInt();
                System.out.println("Enter the length of side 2 of the triangle:");
                int side2 = sc.nextInt();
                System.out.println("Enter the length of side 3 of the triangle:");
                int side3 = sc.nextInt();
                perimeter = side1 + side2 + side3;
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        System.out.println("Perimeter: " + perimeter);
    }
}
