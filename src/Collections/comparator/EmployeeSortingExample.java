package Collections.comparator;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class EmployeeSortingExample {
    public static void main(String[] args) {
        Set <Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("John", 101, 90000));
        employeeSet.add(new Employee("Bob", 103, 55000));
        employeeSet.add(new Employee("Smith", 101, 45000));
        employeeSet.add(new Employee("Rock", 105, 80000));
        employeeSet.add(new Employee("Charlie", 104, 70000));
        employeeSet.add(new Employee("John", 102, 80000));

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

//        ------------------------------------------------------------------------------------------------------

        //3. Using Comparator.comparing:
//        System.out.println("comprartor comparaing method on the Name ");
//        employeeList.sort(Comparator.comparing(Employee::getName).reversed());
//        printList(employeeList);
//        System.out.println();
//
//        System.out.println("comprartor comparaing method on the Id ");
//        employeeList.sort(Comparator.comparing(Employee::getId));
//        printList(employeeList);
//        System.out.println();
//
//        System.out.println("comprartor comparaing method on the Salarry ");
//        employeeList.sort(Comparator.comparing(Employee::getSalarry));
//        printList(employeeList);

//        -----------------------------------------------------------------------------------------------------

        //4. Using Stream API for Sorted Output (Not Modifying Original List):
//        System.out.println("stream by the name");
//        List<Employee> sortedName = employeeList.stream().sorted(Comparator.comparing(Employee::getId)).toList();
//        printList(sortedName);
//        System.out.println();
//
//
//        System.out.println("Stream by the id");
//        List<Employee> sortedId = employeeList.stream().sorted(Comparator.comparing(Employee::getId).reversed()).toList();
//        printList(sortedId);
//        System.out.println();
//
//        System.out.println("Stream by the Salarry");
//        List<Employee> sortedSalarry = employeeList.stream().sorted(Comparator.comparing(Employee::getSalarry)).toList();
//        printList(sortedSalarry);
//        System.out.println();

//        ------------------------------------------------------------------------------------------------------------------

//        5. Chained Comparisons (e.g., by name and then id if names are equal):
//        System.out.println("(e.g., by name and then id if names are equal):");
//        employeeList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getId));
//        printList(employeeList);
//        System.out.println();
//
//        System.out.println("(e.g., by name and then salarry if names are equal):");
//        employeeList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalarry));
//        printList(employeeList);
//        System.out.println();
//
//        System.out.println("(e.g., by Id and then salarry if names are equal):");
//        employeeList.sort(Comparator.comparing(Employee::getId).thenComparing(Employee::getSalarry));
//        printList(employeeList);
//        System.out.println();
//        -------------------------------------------------------------------------------------------------
//      SORTIING OF THE TWO OBJECTS FROM FOLLOWING METHODS

//
//        Sorting the list by using Anonymous in the two objects
//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                int idcomparae = o1.getId()- o2.getId();
//                if (idcomparae == 0){
//                    return o1.getName().compareTo(o2.getName());
//                }else {
//                    return idcomparae;
//                }
//            }
//        });
//        printList(employeeList);

//        //2. Using a Lambda Expression:
//        employeeList.sort((e1 , e2 ) -> {
//            int idCompare = Integer.compare(e1.getId(), e2.getId());
//            if (idCompare == 0) {
//                return Double.compare(e1.getSalarry(), e2.getSalarry());
//            }
//            return idCompare;
//        });
//        printList(employeeList);

        //3Using Comparator.comparing:  that is thea t the 5 point about the comprianes


        //simple for loop for comparing in the list
        System.out.println("Employees with salary > 50k:");
        for (Employee emp : employeeList){
            if (emp.getSalarry() > 50000){
                System.out.println(emp);
            }
        }
    }

    public static void printList (List<Employee> employeeList){
        for (Employee emp : employeeList){
            System.out.println(emp.toString());
        }
    }
}
