package encapsulationtest2;

class Test{
    int i ;
    void setValue(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}

public class keywordTHIS {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setValue(10);
        t1.show();
        System.out.println("hello");
    }
}
