package polymorphism;

public class Test {
    public static void main(String[] args) {
        SbiBank sbiBank = new SbiBank();
        sbiBank.calculate();

        AxisBank axisBank = new AxisBank();
        axisBank.calculate();

        IcicicBank icicicBank = new IcicicBank();
        icicicBank.calculate();
    }

}
