package Collections.comparator;

import java.util.Comparator;

public class SalarryComparator  implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalarry() - o2.getSalarry());
    }
}
