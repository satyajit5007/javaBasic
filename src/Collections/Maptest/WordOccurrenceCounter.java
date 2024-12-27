package Collections.Maptest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordOccurrenceCounter {
    public static void main(String[] args) {
        // List of words to process
        List<String> wordList = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "apple");

        // Map to store the word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Loop through each word in the list
        for (String word : wordList) {
            // If the word already exists in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word doesn't exist in the map, add it with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
