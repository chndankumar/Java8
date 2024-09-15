package Java8;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = getName(2);
        // if (name.isPresent()) {
        // System.out.println(name.get());
        // }
        // name.ifPresent(System.out::println);// this method will a consmer

        String nameToBeUsed = name.orElse(null);// it will return null no value
        // String nameToBeUsed = name.orElse("no name available"); return the message
        // String nameToBeUsed = name.orElseGet(() -> "no name available"); this will
        // take an supplier method
        // String nameToBeUsed = name.orElseThrow(()-> new NoSuchElementExceptions());
        System.out.println(nameToBeUsed);
    }

    private static Optional<String> getName(int i) {
        String name = "chandan";
        String name1 = null;
        // return Optional.of(name1); this not handle the null value
        return Optional.ofNullable(name1);
    }
}
