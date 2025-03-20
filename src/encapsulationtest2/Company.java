package encapsulationtest2;

class Employee{
    private int emp_id;

    public void SetEmpId(int id){
        this.emp_id = id;
    }

    public int GetEmpId(){
        return emp_id;
    }

}


public class Company {
    public static void main(String[] args) {
        Employee emp =new Employee();
        emp.SetEmpId(100);
        emp.GetEmpId();
        System.out.println(emp.GetEmpId());

    }
}
