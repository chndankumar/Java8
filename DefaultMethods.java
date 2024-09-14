package Java8;

interface Parent {
    default void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child implements Parent {

}

class Child1 implements Parent {
    @Override
    public void sayHello() {
        System.out.println("Hello from Parent");
    }
}

interface A {
    default void sayHello() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void sayHello() {
        System.out.println("Hello from B");
    }
}

public class DefaultMethods implements A, B {

    // @Override
    // public void sayHello() {
    // System.out.println("Hello from DefaultMethods");
    // }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.sayHello(); // do need to override it else you can overide it if you want
        DefaultMethods defaultMethods = new DefaultMethods();
    }
}
