package prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {

    //type: Class::instanceMethod
    Function<String, String> upper1 = (String x) -> x.toUpperCase();
    Function<String, String> upper2 = String::toUpperCase;

    //type: Class::instanceMethod
    BiConsumer<Employee, String> name1 = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> name2 = Employee::setName;

    // type: Class::instanceMethod
    BiFunction<String, String, Integer> compare1 = (String s1, String s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> compare2 = String::compareTo;

    //type: Class::staticMethod
    BiFunction<Integer, Integer, Double> pow1 = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> pow2 = Math::pow;

    //type: Class::instanceMethod
    Function<Apple, Double> apple1 = (Apple a) -> a.getWeight();
    Function<Apple, Double> apple2 = Apple::getWeight;

    //type: Class::staticMethod
    Function<String, Integer> parseInt1 = (String x) -> Integer.parseInt(x);
    Function<String, Integer> parseInt2 = Integer::parseInt;

    //type: instance::instanceMethod
    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee, Employee, Integer> comp1 = (Employee e1, Employee e2) -> comp.compare(e1, e2);
    BiFunction<Employee, Employee, Integer> comp2 = comp::compare;


  ;

    public void evaluator() {
        System.out.println(upper2.apply("hello"));
        Employee employee = new Employee("Bob",10);

        name2.accept(employee,"Leo");
        System.out.println(employee.getName());

        System.out.println( compare2.apply("Leo","Leo"));

        System.out.println(pow2.apply(10,2));

        System.out.println(apple2.apply(new Apple(5.5)));

        System.out.println(parseInt2.apply("35"));
        System.out.println(comp2.apply(new Employee("Bob",30),new Employee("Bob",10)));

    }

    public static void main(String[] args) {
        Examples e = new Examples();
        e.evaluator();

    }
}
