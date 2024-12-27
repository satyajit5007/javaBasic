package Collections.camparable;


public class Employee1 implements Comparable<Employee1> {


    private String name;
    private int id;
    private double salaray;

    //sort by name ascending order
//    @Override
//    public int compareTo(Employee o) {
//        return this.getName().compareTo(o.getName());
//    }

    //sort by name in the descending order
//    @Override
//    public int compareTo(Employee o) {
//        return o.getName().compareTo(this.getName());
//    }

//    @Override
//    public int compareTo(Employee o) {
////        return this.getId() - o.getId();
//        return Integer.compare(this.getId(), o.getId());
//    }

//    @Override
//    public int compareTo(Employee o) {
//        return (int) (this.getSalaray() - o.getSalaray());
//    }


    // ascending order campare with Name and Salaray
//    @Override
//    public int compareTo(Employee o) {
//        int camparatortest =  this.getName().compareTo(o.getName());
//        if (camparatortest ==  0){
////            return (int) (this.getSalaray() - o.getSalaray());
//            double v = this.getSalaray() - o.getSalaray();
//            return (int) v;
//        }
//        return camparatortest;
//    }



//        @Override
//    public int compareTo(Employee o) {
//        int camparatortest = this.getId() - o.getId();
//        if (camparatortest ==  0){
////            return (int) (this.getSalaray() - o.getSalaray());
//            double v = o.getSalaray() -this.getSalaray();
//            return (int) v;
//        }
//        return camparatortest;
//    }














    public Employee1(String name, int id, double salaray){
        this.name= name;
        this.id = id;
        this.salaray = salaray;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salaray=" + salaray +
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

    public double getSalaray() {
        return salaray;
    }

    public void setSalaray(double salaray) {
        this.salaray = salaray;
    }

    @Override
    public int compareTo(Employee1 o) {
        return 0;
    }
}
