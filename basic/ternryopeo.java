package basic;
import java.util.Scanner;
public class ternryopeo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int num = sc.nextInt();

	        String result = (num % 2 == 0) ? "Even" : "Odd";

	        System.out.println(num + " is " + result);
	    }
}