package prob6;

public class Employee {
    String name;
    int salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }
}
