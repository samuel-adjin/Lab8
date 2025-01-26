package prob6;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
        public EmployeeNameComparator() {
        }

        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }
    }

