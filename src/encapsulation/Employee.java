package encapsulation;

public class Employee {
    private String name;
    private int empid;

    public void setName(String n){
        this.name = n;
    }
    public void setEmpid(int id){
        if (id< 0){
            System.out.println("enter value greaterthan 1000");
            return;
        }  if (id <101 ) {
            System.out.println("enter value greater than 100");
            return;
            
        }this.empid= id;
    }

    public String getName(){
        return this.name;
    }

    public int getEmpid(){
        return this.empid;
    }
}
