package abstraction;

public interface Vehicle {


//    100% abstraction using interface.
    public void run();
    public void fuel();

    public void range();

    public static void xyz(){
        System.out.println("interface static method call by java 9 Direct Call");
    }

    public default void pqr(){
        System.out.println("interface  default method call by java 9  NO Direct Call");
    }
}
