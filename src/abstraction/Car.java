package abstraction;

public class Car implements Vehicle {

    @Override
    public void run() {
        System.out.println("Vehicle Running");
    }

    @Override
    public void fuel() {
        System.out.println("Fueling");
    }

    @Override
    public void range() {
        System.out.println("Range");
    }
}
