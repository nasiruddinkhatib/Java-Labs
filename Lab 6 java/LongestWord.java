package String;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, word, lword;
        System.out.println("Enter the String");
        str = sc.nextLine();
        word = "";
        lword = "";
        str = str + " "; // Add a space at the end to make sure the last word is processed
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (word.length() > lword.length())
                    lword = word;
                word = ""; // Reset word for the next word
            } else {
                word = word + ch;
            }
        }
        System.out.println("Longest is " + lword + " " + "Length is " + lword.length());
    }
}
