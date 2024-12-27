package HWabstraction.abstraction;

public class boy  extends Human{

    @Override
    public void eat() {
        System.out.println("body in the chlid  call");
    }

    @Override
    public void run(){
        System.out.println("Boy is running");
    }
}
