package Java8.DateTimeAPI;

import java.time.*;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // LocalDate custamDate = LocalDate.of(1998, 9, 21);
        // System.out.println(custamDate);

        // int year = now.getYear();
        // int monthNo = now.getMonthValue();
        // Month month = now.getMonth();
        // int day = now.getDayOfMonth();
        // System.out.println(year);
        // System.out.println(monthNo);
        // System.out.println(month);
        // System.out.println(day);

        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);
        LocalDate pastDate = today.minusMonths(100);
        System.out.println(pastDate);

        if (today.isAfter(yesterday)) {
            System.out.println("true");
        }

    }
}
