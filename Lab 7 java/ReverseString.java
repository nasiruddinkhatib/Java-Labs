package lab30_5_24;
//Write A program for Converting a sentence in reverse
public class ReverseString {
public static void main(String[]args) {
	String str = "BASIC IS PROGRAMMING";
	str=" " +str+ "";
	String reverse ="";
	int end =str.length();
	
	for(int i=str.length()-1;i>=0;i--) {
		if((str.charAt(i)==' ')) {
			reverse += str.substring(i,end);
			end =i;
		}
	}
	  System.out.println(reverse);

}
}
