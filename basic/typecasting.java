package basic;
import java.util.*;
public class typecasting {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int x,y;
	System.out.println("Enter the value of x");
	x=sc.nextInt();
	System.out.println("Enter the value of y");
	y=sc.nextInt();
	double z=x+y;
	System.out.println("The result is"+z);
	int a=(int)z+y+x;
	System.out.println("The result is"+a);
}
}

