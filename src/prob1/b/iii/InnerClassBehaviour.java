package prob1.b.iii;

import java.util.function.Supplier;

public class InnerClassBehaviour {

    static class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

    public static void main(String[] args) {
        Supplier<Double> supplier = new RandomSupplier();
        System.out.println("Random Number: " + supplier.get());
    }
}
