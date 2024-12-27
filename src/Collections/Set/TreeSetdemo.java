package Collections.Set;

import java.util.TreeSet;

public class TreeSetdemo {
    public static void main(String[] args) {

        TreeSet <String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Apple"); // Duplicate, will not be added
        System.out.println( treeSet);

        treeSet.remove("Banana");
        System.out.println(treeSet);

        System.out.println(treeSet.size());

//        System.out.println(treeSet.contains("Cherry"));

//        treeSet.clear();
//        System.out.println(treeSet);

        for (String fruits : treeSet){
            System.out.println(fruits);
        }

        System.out.println(treeSet);


    }
}
