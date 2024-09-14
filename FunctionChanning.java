package Java8;

import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionChanning {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = x -> 2 * x;
        Function<Integer, Integer> f2 = x -> x * x * x;

        // Function<Integer, Integer> f3 = f1.andThen(f2);
        // System.out.println(f3.apply(5));

        System.out.println(f1.andThen(f2).apply(3));// 216
        System.out.println(f2.andThen(f1).apply(3));// 54

        System.out.println(f1.compose(f2).apply(3));// 54

        // Function interface one more method that is identity which return what imput
        // it take
        Function<String, String> f4 = Function.identity();
        System.out.println(f4.apply("Chandan"));
    }
}
