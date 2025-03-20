package multiThreading;

public class threading  {

    public static void main(String[] args) {

        myThread t1 = new myThread("abc");
        t1.start();
        System.out.println("after wait");
//        t1.setName("xyz");
    }
}
