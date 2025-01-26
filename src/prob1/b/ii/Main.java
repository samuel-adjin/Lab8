package prob1.b.ii;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<Double> supplier = Math::random;
        System.out.println("Random Number: " + supplier.get());
    }
}
