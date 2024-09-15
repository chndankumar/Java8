package Java8.DateTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Current LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        // Custom LocalDateTime (Year, Month, Day, Hour, Minute, Second)
        LocalDateTime customDateTime = LocalDateTime.of(1998, 9, 21, 14, 59, 59);
        System.out.println("Custom Date and Time: " + customDateTime);

        // Accessing individual fields from LocalDateTime
        int year = now.getYear();
        int monthNo = now.getMonthValue();
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        System.out.println("Year: " + year);
        System.out.println("Month Number: " + monthNo);
        System.out.println("Day of Month: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        // Subtracting days and hours from LocalDateTime
        LocalDateTime pastDateTime = now.minusDays(10).minusHours(5);
        System.out.println("DateTime 10 days and 5 hours ago: " + pastDateTime);

        // Comparing LocalDateTime instances
        if (now.isAfter(pastDateTime)) {
            System.out.println("Current DateTime is after the past DateTime");
        }

        // Parsing LocalDateTime from a string
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-09-15T14:35:56");
        System.out.println("Parsed DateTime: " + parsedDateTime);
    }
}
