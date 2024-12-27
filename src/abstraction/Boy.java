package abstraction;

public class Boy  extends Human{
    @Override
    public void run(){
        System.out.println("Boy is Running");
    }

    @Override
    public void eat(){
        System.out.println("Boy is eating");
    }
}
