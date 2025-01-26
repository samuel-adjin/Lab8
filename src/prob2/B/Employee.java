package prob2.B;

import java.util.Objects;

public class Employee {
        String name;
        int salary;
        public Employee(String n, int s) {
            this.name = n;
            this.salary = s;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append("name: ");
            sb.append(name);
            sb.append(" salary: ");
            sb.append("" + salary+">");
            return sb.toString();

        }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employee employee)) return false;
//        return salary == employee.salary && Objects.equals(name, employee.name);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, salary);
//    }
}
