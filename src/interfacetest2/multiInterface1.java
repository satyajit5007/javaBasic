package interfacetest2;

import java.sql.SQLOutput;

interface A {

}

interface B {

}

class C implements A, B {
    public void methodA(){
        System.out.println("Method A from the Interface A");
    }

    public void methodB(){
        System.out.println("Method B form the Interface B ");
    }
}


public class multiInterface1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }

}
