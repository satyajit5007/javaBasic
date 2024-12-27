package Inheritance;

public class test {
    public static void main  (String[] args) {
//        A a = new A();
//        System.out.println(a.x);
//        B b = new B();
//        System.out.println(b.y);
//        System.out.println(b.x);
//
//        a.msg();
//        b.msg();

        car carinfo = new car();
        System.out.println(carinfo.brand +" "+ carinfo.model);

        Bus businfo = new Bus();
        System.out.println(businfo.brand+" " +businfo.model);
    }
}
