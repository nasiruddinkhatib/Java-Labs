package lab30_5_24;
	import java.util.Scanner;

	/* Accept two strings, a word and a sentence. Then find number of times the word
	is present in given string. If I enter 'THE' and 'THE BIG FAT THE ODORE',
	then the computer should display 2. */
	// String find = "THE";
	// String str = "THE BIG FAT THE ODORE";

	public class Accept2String
	{
	    public static void main(String[] args) {
	        System.out.print("Enter a Big str - ");
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine().toLowerCase();
	        
	        System.out.print("Enter a str to find - ");
	        String find = sc.next().toLowerCase();
	        
	        int count = 0;
	        int fromEnd = 0; // store the end of string "THE";
	        for (int i = 0; i < str.length(); i++) {

	            if ((str.indexOf(find, fromEnd)) >= 0) {

	                fromEnd = (str.indexOf(find, fromEnd)) + find.length();
	                count++;
	            }

	            // this code is use, to stop the loop if string "THE" is not present in str
	            // anymore
	            // without below if condition program still give correct result
	            // it's just for optimization
	            if (!(str.indexOf(find, fromEnd) >= 0)) {
	                break;
	            }
	        }
	        System.out.println(find + " repeats - " + count + " times");
	    }
	}

