package Collections.comparator;

import java.sql.SQLOutput;
import java.util.*;

public class EmployeeSortingExample {
    public static void main(String[] args) {
        Set <Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("John", 101, 60000));
        employeeSet.add(new Employee("Bob", 103, 55000));
        employeeSet.add(new Employee("Smith", 101, 45000));
        employeeSet.add(new Employee("Rock", 105, 80000));
        employeeSet.add(new Employee("Charlie", 104, 70000));

        List<Employee> employeeList =new ArrayList<>(employeeSet);

//        0.these createing the new class of name for comparator their object with each other,
//        Collections.sort(employeeList, new Namecomparator());
//        Collections.sort(employeeList, new idcomparator());
//        Collections.sort(employeeList , new SalarryComparator());
//        -------------------------------------------------------------------------------------------------------

//        1.Using an Anonymous Class:
//
//        System.out.println("Anonymous Sorting by the Name");
//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        System.out.println("anoymous sorting by using the id");
//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getId()- o2.getId();
//            }
//        });
//        printList(employeeList);
//        System.out.println();
//
//        System.out.println("anaoymous sorting by the salarry");
//
//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalarry()- o2.getSalarry());
//            }
//        });
//        --------------------------------------------------------------------------------------------------


//       2. Sorting by the Lambda Function
//        System.out.println("lambda Sorting by the name");
//        employeeList.sort((e1 ,e2) -> e1.getName().compareTo(e2.getName()));
//        printList(employeeList);
//        System.out.println();
//
//        System.out.println("Lambda sorting by the id");
//        employeeList.sort((e1 , e2) -> e1.getId()- e2.getId());
//        printList(employeeList);
//        System.out.println();
//
//        System.out.println("lambda sorting by the salarry");
//        employeeList.sort((e1 , e2) -> (int) (e1.getSalarry()- e2.getSalarry()));
//        printList(employeeList);
//        System.out.println();



    }

    public static void printList (List<Employee> employeeList){
        for (Employee emp : employeeList){
            System.out.println(emp.toString());
        }
    }
}
