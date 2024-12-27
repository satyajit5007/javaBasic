package String;

public class StringMethods {
    public static void main(String[] args) {

        //string is immutable and aslo it can be stored in the STRING CONTACT POOL
        String abc = "ABC";
//        System.out.println(abc);

        // String Object Creation
        String a1 = new String("abcd");
//        System.out.println(a1);


        String a = "satyajit";
        String b = "satyajit";
        String c = "sagar";

        System.out.println("content comparsion  "+a.equals(b));
        System.out.println(b.equals(c));

//        reference comparsion
        System.out.println(a == b);
        System.out.println(a == a1);







    }
}
