package Collections.Maptest;
import java.util.*;

public class StringOccurrences {
    public static void main(String[] args) {
        List<String> wordcount  = Arrays.asList("apple","apple", "apple", "banana", "apple", "orange", "banana", "apple");

        Map<String , Integer> wordmap = new HashMap<>();
        for (String word : wordcount){
            if (wordmap.containsKey(word)){
                wordmap.put(word, wordmap.get(word)+1);
            }else {
                wordmap.put(word, 1);
            }
        }

        for (Map.Entry<String , Integer> entry : wordmap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
