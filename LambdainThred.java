package Java8;

public class LambdainThred {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Thread th = new Thread(runnable);
        th.run();
    }
}
