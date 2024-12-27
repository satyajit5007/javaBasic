package Collections.camparable;

import java.util.*;


public class camparableexample1 {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("John", 2, 50000));
        employees.add(new Employee1("Rohan", 1, 10000));
        employees.add(new Employee1("Alice", 2, 30000));
        employees.add(new Employee1("Sam", 4, 20000));
        employees.add(new Employee1("John", 5, 40000));

//        System.out.println("before the sorting");
//        printlist(employees);
//
//        //1. Sort employee list basis on the name ascending/descending order
        Collections.sort(employees);
//        Collections.sort(employees , Collections.reverseOrder());
        System.out.println("After sorting by name");
        printlist(employees);

        Set<Employee1> employeesSet = new HashSet<>();
        employeesSet.add(new Employee1("Rohan", 1, 10000));
        employeesSet.add(new Employee1("John", 2, 50000));
        employeesSet.add(new Employee1("Alice", 3, 30000));
        employeesSet.add(new Employee1("Sam", 4, 20000));
        employeesSet.add(new Employee1("John", 5, 40000));

        List<Employee1> employeeList = new ArrayList<>(employeesSet);
//        System.out.println(employeeList);
//        printlist(employeeList);
        System.out.println("------------------------------------------");
//        printlist(employees);





    }
    public static void printlist (List<Employee1> employeeList){
        for (Employee1 emp : employeeList){
            System.out.println(emp.toString());
        }
    }
}
