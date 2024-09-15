package Java8.Stream;

import java.util.*;
import java.util.stream.*;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 9, 2, 56, 78, 233, 6, 5, 89, 3, 60, 0,
                1, 2, 6);

        List<Integer> filteredList = list.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        // List<Integer> mappedList = list.stream().filter((n) -> n % 2 == 0).map((n) ->
        // n / 2)
        // .collect(Collectors.toList());

        List<Integer> mappedList = filteredList.stream().map((n) -> n /
                2).collect(Collectors.toList());
        System.out.println(mappedList);

        List<Integer> distinctList = filteredList.stream().map((n) -> n /
                2).distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        List<Integer> sortedList = filteredList.stream()
                .map((n) -> n / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> limitedList = filteredList.stream()
                .map((n) -> n / 2)
                .distinct()
                .sorted((a, b) -> (b - a)).limit(4)
                .collect(Collectors.toList());
        System.out.println(limitedList);

        List<Integer> skipedList = filteredList.stream()
                .map((n) -> n / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .limit(4).skip(2)
                .collect(Collectors.toList());
        System.out.println(skipedList);

        List<Integer> collect = Stream.iterate(0, n -> n + 1)
                .limit(101).skip(3)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted().peek(x -> System.out.println(x))// use to perform some task and take consumer
                .collect(Collectors.toList());
        System.out.println(collect);

        Integer maxNum = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .map(x -> x / 22)
                .distinct()
                .peek(System.out::println)
                .max((a, b) -> a - b)
                .get();
        System.out.println(maxNum);

        Long countNum = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .map(x -> x / 22)
                .distinct()
                .count();
        System.out.println(countNum);

        List<Integer> li = Arrays.asList(1, 2, 34, 5, 7);
        li.parallelStream();
        // this work same break task in samll chunk and assign to thread to perform
        // quick do not use it on small data other wise it will take more time;
    }

}
