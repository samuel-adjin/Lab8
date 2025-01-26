package prob5.a;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public ForEachExample() {
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation", "Everywhere you want to be");
        list.forEach(text -> System.out.println(text));
    }
}
