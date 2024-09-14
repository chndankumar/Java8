package Java8;

// inhetiance in Functional interface
@FunctionalInterface
public interface Parent {
    public void sayHello();
}

// interface Child extends Parent {
// public void saybye();
// } // this will work

// @FunctionalInterface
// interface Child extends Parent {
// public void sayBye();
// } this will not work

// @FunctionalInterface
// interface Child extends Parent {
// public void sayHello();
// }// this will work

@FunctionalInterface
interface Child extends Parent {
    public void sayHello();

    default void sayBye() {

    }

    public static String sayOk() {
        return "ok";
    }
}