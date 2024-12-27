package abstraction;

public abstract class Human {


//    100% abstraction
    public abstract void run();

    public void eat(){
        System.out.println("human is eating a food");
    }

//    static method
    public static void sleep(){
        System.out.println("Human is Sleeping");
    }

    public final void walk(){
        System.out.println("human is walking");
    }

//    0% abstraction normal


    public static void staticmethodcall(){
        System.out.println("only static methods calls directly ");
    }


}
