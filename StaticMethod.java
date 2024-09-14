package Java8;

interface A {
    static void sayHello() {
        System.out.println("Hello There");
    }
}

public class StaticMethod implements A {

    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();
        // staticMethod.sayHello(); not accesable
        // StaticMethod.sayHello(); not accesable
        A.sayHello(); // this will work only
    }
    // this is not overriden this normal class own metho as we can see above the say
    // method is not seen by class
    // private static void sayHello() {
    // System.out.println("Hello from my Method");
    // }

}
