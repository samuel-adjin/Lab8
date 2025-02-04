package prob2.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY};
    public void sort(List<Employee> emps,  SortMethod method) {
        Collections.sort(emps, (e1,e2) ->
        {
            if(method == SortMethod.BYNAME) {
                if (e1.name.compareTo(e2.name) != 0) {
                    return e1.name.compareTo(e2.name);
                } else {
                    return Integer.compare(e1.salary, e2.salary);
                }
            } else {
                if(e1.salary != e2.salary){
                    return Integer.compare(e1.salary, e2.salary);
                }
                return e1.name.compareTo(e2.name);            }
        });
    }



    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Andy", 60000));
        EmployeeInfo ei = new EmployeeInfo();
        ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
        System.out.println(emps);
        //same instance
        ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
        System.out.println(emps);



    }
}


