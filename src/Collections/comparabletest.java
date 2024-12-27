package Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparabletest {
    public static void main(String[] args) {

        List <employeetest> emp1 = new ArrayList<>();
        emp1.add(new employeetest("John", 2, 50000));
        emp1.add(new employeetest("Rohan", 1, 10000));
        emp1.add(new employeetest("Alice", 2, 30000));
        emp1.add(new employeetest("Sam", 4, 20000));
        emp1.add(new employeetest("John", 5, 40000));

        System.out.println("Before the sorting and toString");
        System.out.println(emp1);

        System.out.println("---------------------------------------------");

        System.out.println("after the Sorting by the name");
        Collections.sort(emp1);
        printLisT(emp1);

    }
    public static void printLisT(List <employeetest> emp1){
        for (employeetest emp2 : emp1){
            System.out.println(emp2.toString());
        }
    }
}
