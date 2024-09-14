package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(5);

        Consumer<List<Integer>> listConsumer = li -> {
            for (int i : li) {
                System.out.println(i + 100);
            }
        };
        // listConsumer.accept(Arrays.asList(1, 2, 5, 7));

        Consumer<List<Integer>> listConsumer2 = li -> {
            for (int i : li) {
                System.out.println(i);
            }
        };
        listConsumer2.andThen(listConsumer).accept(Arrays.asList(1, 2, 5, 7));
        Consumer<List<Integer>> listConsumer3 = listConsumer2.andThen(listConsumer);
        listConsumer3.accept(Arrays.asList(1, 2, 5, 7));
    }
}
