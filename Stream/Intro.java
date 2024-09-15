package Java8.Stream;

import java.util.*;
import java.util.stream.Stream;

public class Intro {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3 };
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // sum += arr[i];
        // }
        // }
        // int[] arr2 = { 1, 2, 3, 4 };
        // int sum2 = Arrays.stream(arr2).filter(x -> x % 2 == 0).sum();
        // System.out.println(sum);

        // how to declare the string

        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        Stream<String> myStream = list.stream();
        String[] arr = { "Apple", "Banana", "Orange" };
        Stream<String> streamArray = Arrays.stream(arr);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(5);

        Stream<Integer> li = Stream.generate(() -> (int) Math.random() * 10).limit(11);
    }
}
