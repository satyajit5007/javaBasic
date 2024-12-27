package String;

public class Smethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = "  World  ";

        System.out.println(str2.trim());
        System.out.println(str1.concat(str2));


        StringBuffer str3 = new StringBuffer("rohan");
        StringBuffer str4 = new StringBuffer(" bhosale");
//        System.out.println(str3.append(str4));
        System.out.println(str3.reverse());



    }
}
