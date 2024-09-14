package Java8;

@FunctionalInterface
public interface Functional_Interface {
    public void sayHello();

    // public void sayBye(); not allowed only one method is

    default void sayBye() {

    }

    public static String sayOk() {
        return "ok";
    }
}
