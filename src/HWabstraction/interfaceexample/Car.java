package HWabstraction.interfaceexample;

public class Car implements Vehicle {

    @Override
    public void power() {
        System.out.println("Cars Horse Power");

    }

    @Override
    public void mileage() {
        System.out.println("Cars mileage test ");

    }

    @Override
    public void ev() {
        System.out.println("Ev cars");

    }
}
