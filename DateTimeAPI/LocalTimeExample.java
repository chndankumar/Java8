package Java8.DateTimeAPI;

import java.time.*;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        // System.out.println(now);
        // System.out.println(now.getHour());
        // System.out.println(now.getSecond());

        LocalTime beforeTime = now.minusHours(2);
        System.out.println(beforeTime);

        LocalTime customTime = LocalTime.of(14, 59, 59);
        System.out.println(customTime);

        if (beforeTime.isBefore(now)) {
            System.out.println("yess....");
        }

        LocalTime parseTime = LocalTime.parse("14:35:56");
        System.out.println(parseTime);
    }
}
