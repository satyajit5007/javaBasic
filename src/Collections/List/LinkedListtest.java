package Collections.List;

import java.util.LinkedList;

public class LinkedListtest {
    public static void main(String[] args) {

        LinkedList a1 = new LinkedList();
        a1.add("adding");
//        a1.remove();
//        a1.addAll();
//        a1.set();
//        a1.clear();
//        a1.getFirst();
        a1.push("pushing element");
        a1.pop();
        System.out.println(a1);

        LinkedList <String> a0 = new LinkedList<>();
        a0.add("demo for multi test");


        LinkedList <Integer> a2 = new LinkedList<>();
        a2.add(1);//
//        a2.addAll(a0);  a0 String or a2 Integer  so it compiler treats as type error
        a2.addAll(a1);  //a1 object and a2 Integer so the compiler bypass the type checking
        System.out.println(a2);

    }
}
