package Collections.Set;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {

        HashSet <Integer> hs = new HashSet<>();
        hs.add(40);
        hs.add(20);
        hs.add(10);
        hs.add(30);
        hs.add(null);
        System.out.println(hs);
//
//        HashSet <Integer> hstest = new HashSet<>();
//        hstest.add(70);
//
//        HashSet <String> hs1 = new HashSet<>();
//        hs1.add("Rohan");
//        hs1.add("satyajit");
//        hs1.add("pankaj");
//        hs1.add("Sagar");
//        hs1.add("Ram");
//        hs1.add(null);
//        hs1.add(null);
//        hs1.add("");
//        hs1.add("");
//        System.out.println(hs1);
//
//        HashSet hs2 = new HashSet();
//        hs2.add(10);
//
//        System.out.println(hs2.addAll(hs));


//        -----------------------------------------------------------------------


        HashSet <String> fSet = new HashSet<>();
        fSet.add("Apple");
        fSet.add("Banana");
        fSet.add("Cherry");
        fSet.add("Apple"); //duplicate not allowed or one Null allowed;

        System.out.println(fSet);

        System.out.println(fSet.remove(1));
        System.out.println(fSet.remove(("Cherry")));
        System.out.println(fSet.size());
        System.out.println(fSet);
        fSet.clear();
        System.out.println(fSet);

        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added
//        System.out.println( set);

        fSet.addAll(set);
        System.out.println(fSet);

        Boolean a = fSet.contains("Apple");
        System.out.println(a);

        int size = fSet.size();
        System.out.println(size);

        fSet.clear();
        System.out.println("all clear");



    }
}
