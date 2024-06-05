package lab30_5_24;

import java.util.Scanner;   

public class PiglatinWord {
    public static void main(String[] args) {
        System.out.println("Enter a Word ");
        Scanner sc = new Scanner(System.in);
        String original = sc.next().toUpperCase();
        sc.close();
        
        int i;
        for (i = 0; i < original.length(); i++) {
            char chr = original.charAt(i);
            if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
                break;
            }
        }
        
        if (i == 0) {
            // If the word starts with a vowel, it remains unchanged
            System.out.println("Piglatin Word - " + original);
        } else if (i < original.length()) {
            // If a vowel is found and it's not the first character
            System.out.println("Piglatin Word - " + original.substring(i) + original.substring(0, i) + "AY");
        } else {
            // If no vowel is found in the word
            System.out.println("Piglatin Word - " + original);
        }
    }
}
