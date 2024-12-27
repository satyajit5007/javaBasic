package Collections.Maptest;
import java.util.*;

public class StringOccurrences {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "apple");

        Map<String , Integer> strMap = new HashMap<>();

        for (String str : strings){
            if (strMap.containsKey(str)){
                strMap.put(str,strMap.get(str)+1 );
            }else {
                strMap.put(str, 1);
            }
        }

       for (Map.Entry<String, Integer> entry : strMap.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }

    }
}
