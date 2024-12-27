package HWabstraction.interfaceexample;

public interface Vehicle {
    public void power();

    public void mileage();

    public void ev();

    public static void carinfo(){
        System.out.println("BMW  Direct Call");
    }

    public default void cardefault(){
        System.out.println("default calling by no direct method");
    }


}
