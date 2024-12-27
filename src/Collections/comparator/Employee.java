package Collections.comparator;

public class Employee {
    private String name;
    private int id;
    private double salarry;

    public  Employee (String name, int id, double salarry){
        this.name =name;
        this.id =id;
        this.salarry = salarry;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salarry=" + salarry +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarry() {
        return salarry;
    }

    public void setSalarry(double salarry) {
        this.salarry = salarry;
    }
}
