package Collections.Maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMAp {
    public static void main(String[] args) {
        Map <String , Double> hm = new HashMap<>();
        hm.put("Rohan", 500.7);
        hm.put("Pankaj",new Double(123.23) );
        hm.put("Satyajit",new Double ( 5234.61));
        hm.put("Nikhil", new Double(2345.5));
        hm.put("Sagar",new Double( 100.323));
        hm.put("shrikant",null);
        hm.put(null,456.324);
        System.out.println(hm);

        System.out.println(hm.isEmpty());


        Set <Map.Entry<String , Double>> entries = hm.entrySet();
        for (Map.Entry<String , Double> entry : entries){
//            String key = entry.getKey();
//            Double values = entry.getValue();
//            System.out.println("Key :"+ key +" "+ " value:"+" "+ values);
            System.out.println("key:"+ entry.getKey()+" "+"values"+" "+entry.getValue());
        }

        for (Map.Entry<String , Double> entry : entries){
            if (entry.getKey() != null && entry.getKey().equals("Satyajit")){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }

    }

}
