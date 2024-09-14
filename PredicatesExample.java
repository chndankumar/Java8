package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesExample {
    public static void main(String[] args) {
        Predicate<Integer> predicates = (x) -> x > 1000000;
        System.out.println(predicates.test(80000));
        int salary = 2000000;
        if (predicates.test(salary)) {
            System.out.println("pay tax");
        }
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        for (int n : nums) {
            if (isEven.test(n)) {
                System.out.println("EVEN " + n);
            }
        }

        Predicate<String> startWithLetterC = (x) -> (x.toLowerCase().charAt(0) == 'c');
        Predicate<String> endWithLetterN = (x) -> (x.toLowerCase().charAt(x.length() - 1) == 'n');
        Predicate<String> and = startWithLetterC.and(endWithLetterN);
        // System.out.println(and.test("chandan"));
        // System.out.println(and.test("Prince"));
        Predicate<String> or = startWithLetterC.or(endWithLetterN);
        // System.out.println(or.test("Chandan"));
        // System.out.println(or.test("kanchan"));
        // System.out.println(or.test("Prince"));
        // nagate
        System.out.println(startWithLetterC.negate().test("chandan"));
        System.out.println(startWithLetterC.negate().test("Prince"));

    }
}
