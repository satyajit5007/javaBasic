package Collections.camparable;

public class employeetest implements Comparable<employeetest> {

    // Comparable logic Part

//    ----------------------------------------Name-------------------------------------------------------------
//    Sorting the object by the their name in the ascending order
//    @Override
//    public int compareTo(employeetest o) {
//        return this.getName().compareTo(o.getName());
//    }

//    Sorting the object by the their name in the descending order
//    @Override
//    public int compareTo(employeetest o){
//        return o.getName().compareTo(this.getName());
//    }


//    -------------------------------------------id-----------------------------------------------------------
//        Sorting the object by id values in the ascending order
//    @Override
//    public int compareTo(employeetest o){
//        return this.getId() - o.getId();
//    }

    //        Sorting the object by id values in the descending order
//    @Override
//    public int compareTo(employeetest o){
//        return o.getId() - this.getId();
//    }

//    -------------------------------------Salarry-------------------------------------------------------

    //        Sorting the object by salarry values in the ascending order
//    @Override
//    public int compareTo(employeetest o){
//        return (int) (this.getSalarry() - o.getSalarry());
//    }

//            Sorting the object by id salarry in the ascending order
//    @Override
//    public int compareTo(employeetest o){
//        return (int) (o.getSalarry() - this.getSalarry());
//    }

//    -----------------------------------------------------------------------------------------------------------------


//    sorting of the elemnt with name and their salarrys
//    @Override
//    public int compareTo(employeetest o){
//        int compare = this.getName().compareTo(o.getName());
//        if (compare == 0){
//            return (int) (this.getSalarry() - o.getSalarry());
//        } else {
//            return compare;
//        }
//    }

//    sorting of the object with id and name in ascending order
//    @Override
//    public int compareTo(employeetest o){
//        int idcompare = this.getId() - o.getId();
//        if (idcompare == 0){
//            return this.getName().compareTo(o.getName());
//        } else {
//            return idcompare;
//        }
//    }


// sorting of the object by using id and salarry in descending order
//    @Override
//    public int compareTo(employeetest o){
//        int idcompare = this.getId() - o.getId();
//        if (idcompare == 0){
//            return (int) (o.getSalarry() - this.getSalarry());
//        } else {
//            return idcompare;
//        }
//    }

//    ---------------------------------------------------------compare between the two Objects end here---------------




//    list to set conversion their sorting start from here------------------------------------


    @Override
    public int compareTo(employeetest o){
        return o.getName().compareTo(this.getName());
    }


    private String name;
    private int id;
    private double salarry;

    public employeetest(String name, int id, double salarry){
        this.name= name;
        this.id= id;
        this.salarry= salarry;
    }


    @Override
    public String toString() {
        return "employeetest{" +
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
