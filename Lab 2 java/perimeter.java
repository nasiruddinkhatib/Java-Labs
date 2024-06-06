package basic;
import java.util.*;
public class perimeter {
    
    // Function to calculate perimeter
    public static double perimeter(String shape, double... values) {
        double result = 0;
        switch(shape.toLowerCase()) {
            case "square":
                // Perimeter of square = 4 * side
                result = 4 * values[0];
                break;
            case "rectangle":
                // Perimeter of rectangle = 2 * (length + breadth)
                result = 2 * (values[0] + values[1]);
                break;
            case "circle":
                // Perimeter of circle = 2 * (22/7) * radius
                result = 2 * (22.0/7) * values[0];
                break;
            default:
                System.out.println("Invalid shape!");
        }
        return result;
    }
    
    public static void main(String[] args) {
        double side = 4.0;
        double length = 5.0;
        double breadth = 3.0;
        double radius = 2.5;
        
        // Perimeter of square
        System.out.println("Perimeter of square: " + perimeter("square", side));
        
        // Perimeter of rectangle
        System.out.println("Perimeter of rectangle: " + perimeter("rectangle", length, breadth));
        
        // Perimeter of circle
        System.out.println("Perimeter of circle: " + perimeter("circle", radius));
    }
}
