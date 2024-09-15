package Java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorBinaryOperator {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (x) -> x * x;
        UnaryOperator<Integer> unaryOperator = (x) -> x * x;
        System.out.println(function.apply(5));
        System.out.println(unaryOperator.apply(5));

        Function<String, String> functionStr = (x) -> x.toLowerCase();
        UnaryOperator<String> unaryOperatorStr = (x) -> x.toLowerCase();
        System.out.println(unaryOperatorStr.apply("CHANdAN"));

        BiFunction<String, String, String> biFunction = (x, y) -> x + y;
        BinaryOperator<String> binaryOperator = (x, y) -> x + y;
        System.out.println(binaryOperator.apply("chan", "dan"));
    }
}
