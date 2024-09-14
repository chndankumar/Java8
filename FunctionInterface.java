package Java8;

import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> f1 = x -> x.length();
        System.out.println(f1.apply("chandan"));
        Function<String, String> f2 = x -> x.substring(0, 3);
        System.out.println(f2.apply("chandan"));

        Function<List<Student>, List<Student>> function = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (f2.apply(s.getName()).equalsIgnoreCase("vip")) {
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student(2, "vimal");
        Student s2 = new Student(2, "vipul");
        Student s3 = new Student(2, "chadan");
        Student s4 = new Student(2, "vipi");

        List<Student> list = Arrays.asList(s1, s2, s3, s4);
        List<Student> res = function.apply(list);
        System.out.println(res);
    }

    public static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }

    }

}
