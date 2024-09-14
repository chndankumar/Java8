package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LambdaComparator {
    public static void main(String[] args) {
        // List<Integer> li = new ArrayList<>();
        // li.add(2);
        // li.add(8);
        // li.add(4);
        // li.add(7);
        // li.add(0);
        // Collections.sort(li, (a, b) -> b - a);
        // System.out.println(li);

        // Set<Integer> s = new TreeSet<>();
        // s.add(2);
        // s.add(8);
        // s.add(0);
        // System.out.println("Result before manaul sorting " + s);

        // Set<Integer> ss = new TreeSet<>((a, b) -> b - a);
        // ss.add(2);
        // ss.add(8);
        // ss.add(0);
        // System.out.println("Result after manaul sorting " + ss);

        Map<Integer, String> m = new TreeMap<>();
        m.put(2, "a");
        m.put(8, "d");
        m.put(0, "g");
        System.out.println("Result before manaul sorting " + m);

        Map<Integer, String> mm = new TreeMap<>((a, b) -> b - a);
        mm.put(2, "a");
        mm.put(8, "d");
        mm.put(0, "g");
        System.out.println("Result after manaul sorting " + mm);

        List<Student> st = new ArrayList<>();
        st.add(new Student(34, "Chandan"));
        st.add(new Student(3, "Pihu"));
        st.add(new Student(56, "Prince"));
        Collections.sort(st, (a, b) -> (a.id - b.id));
        System.out.println(st);
    }

    public static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }
    }
}
