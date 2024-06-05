import java.util.*;  
class Main {
  public static void main(String[] args) {
 
 
        Scanner sc=new Scanner(System.in); 
        //taking input
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt(); 
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number:");
        int num3 =sc.nextInt(); 
        //checking for the second largest number
        if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2)
            System.out.println("The second largest number is "+num1);
        else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1)
            System.out.println("The second largest number is "+num2);
        else
            System.out.println("The second largest number is "+num3);
    
  }
}
 