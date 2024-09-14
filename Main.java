package Java8;

public class Main {
    public static void main(String[] args) {
        Emplyoee sde = () -> {
            return "Software";
        };
        System.out.println(sde.getName());

        Emplyoee sale = () -> {
            return "sale";
        };
    }
}
