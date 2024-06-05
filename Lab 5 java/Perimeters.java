package FuncOverl;
import java.util.Scanner;

// Perimeter.java
public class Perimeters {
    // Method to calculate perimeter of a square
    public double calculateSquarePerimeters(double side) {
        return 4 * side;
    }

    // Method to calculate perimeter of a rectangle
    public double calculateRectanglePerimeters(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Method to calculate perimeter of a circle
    public double calculateCirclePerimeters(double radius) {
        return 2 * (22.0 / 7) * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perimeters perimeters = new Perimeters();

        // Input for square
        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();

        // Input for rectangle
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double rectangleBreadth = scanner.nextDouble();

        // Input for circle
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        // Calculate and display perimeter of square
        double squarePerimeters = perimeters.calculateSquarePerimeters(squareSide);
        System.out.println("Perimeter of square: " + squarePerimeters);

        // Calculate and display perimeter of rectangle
        double rectanglePerimeters = perimeters.calculateRectanglePerimeters(rectangleLength, rectangleBreadth);
        System.out.println("Perimeter of rectangle: " + rectanglePerimeters);

        // Calculate and display perimeter of circle
        double circlePerimeters = perimeters.calculateCirclePerimeters(circleRadius);
        System.out.println("Perimeter of circle: " + circlePerimeters);

        scanner.close();
    }
}
