package encapsulation;

public class student {
    private String name = "Rohan";
    private int rollno = 07;


//   READ-ONLY CLASS
//    public String getName() {
//        return name;
//    }
//
//    public int getRollno() {
//        return rollno;
//    }


//    WRITE-ONLY CLASS
    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
