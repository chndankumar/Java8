package Java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiPredicateBiFunctionBiConsumer {
    public static void main(String[] args) {
        // Predicate<Integer> predicate = (x) -> x % 2 == 0;
        // BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 !=
        // 0;
        // System.out.println(biPredicate.test(2, 4));
        // System.out.println(biPredicate.test(2, 5));
        BiPredicate<String, Integer> biPredicate = (x, y) -> x.length() == y;

        System.out.println(biPredicate.test("chandan", 7));

        Function<String, Integer> function = (x) -> x.length();
        System.out.println(function.apply("chandan"));
        BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() + y.length();
        System.out.println(biFunction.apply("chandan", "prince"));

        Consumer<Integer> consumer = (x) -> System.out.println(x);
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
        biConsumer.accept(3, 4);

    }
}