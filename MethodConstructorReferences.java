package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class MethodConstructorReferences {
    public void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // method is not static
        MethodConstructorReferences methodConstructorReferences = new MethodConstructorReferences();

        List<String> name = Arrays.asList("ram", "sita", "chandan");
        // students.forEach((x) -> {
        // System.out.println(x);
        // });
        // name.forEach(methodConstructorReferences::print);

        List<Student> students = name.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students);
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

}
