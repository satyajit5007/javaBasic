package interfacetest2;

interface A1 {
    default void show(){
        System.out.println("default the body implementation in it");
    }
    static void display(){
        System.out.println("these implementation body for the static method ");
    }

}

class B1 implements A1{


}

public class defaultiNTEFACE {
    public static void main(String[] args)
    {
        A1.display();
        B1 objB = new B1();
        objB.show();

    }
}
