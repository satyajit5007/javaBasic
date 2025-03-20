package interfacetest2;

interface Vehicle {
    void start ();

    default void stop (){
        System.out.println("vehicle is stopping");
    }

    static void fuelstatus(){
        System.out.println("fuel is the full");
    }

}

class Car implements Vehicle {

    public void start (){
        System.out.println("car is stating");
    }
}


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        Vehicle.fuelstatus();
        car1.stop();
    }
}