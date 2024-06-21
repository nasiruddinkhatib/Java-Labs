package lab13_6_24; //  package name

import java.util.HashMap; // Import the HashMap class
import java.util.Map; // Import the Map interface

public class WordFrequency { 
    public static void main(String[] args) { // Define the main method
        // Input string
        String text = "this is a sample this is example ";

        // Remove punctuation and convert to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Iterate through each word in the array
        for (String word : words) {
            // If the word is already in the HashMap, increment its count
            // Otherwise, add the word to the HashMap with a count of 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
