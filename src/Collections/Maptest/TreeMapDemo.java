package Collections.Maptest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String , Double> hm = new TreeMap<>();
        hm.put("Rohan", 500.7);
        hm.put("Pankaj",new Double(123.23) );
        hm.put("Satyajit",new Double ( 5234.61));
        hm.put("Nikhil", new Double(2345.5));
        hm.put("Sagar",new Double( 100.323));
        hm.put("shrikant",null);
        hm.put(null,456.324);
        System.out.println(hm);

        Set<Map.Entry<String , Double>> entries = hm.entrySet();
        for (Map.Entry<String , Double> entry : entries){
            String key = entry.getKey();
            Double values = entry.getValue();
            System.out.println("Key :"+ key +" "+ " value:"+" "+ values);
//            System.out.println("key:"+ entry.getKey()+" "+"values"+" "+entry.getValue());
        }
    }
}
