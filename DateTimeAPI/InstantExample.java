package Java8.DateTimeAPI;

import java.time.*;

public class InstantExample {
    public static void main(String[] args) {
        Long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        Instant now = Instant.now();
        System.out.println("Current Instant: " + now);

        // Create a custom Instant from Epoch time
        Instant customInstant = Instant.ofEpochMilli(1633046400000L);
        System.out.println("Custom Instant from Epoch Milli: " + customInstant);

        // Add and Subtract from Instant (e.g., 10 seconds and 5 minutes)
        Instant tenSecondsLater = now.plusSeconds(10);
        System.out.println("10 seconds later: " + tenSecondsLater);

        Instant fiveMinutesAgo = now.minus(5, ChronoUnit.MINUTES);
        System.out.println("5 minutes ago: " + fiveMinutesAgo);

        // Difference between two Instants
        Duration timeElapsed = Duration.between(fiveMinutesAgo, now);
        System.out.println("Time elapsed in minutes: " + timeElapsed.toMinutes());

        // Comparing Instants
        if (now.isAfter(fiveMinutesAgo)) {
            System.out.println("The current instant is after 5 minutes ago");
        }

        // Convert Instant to Epoch Milliseconds or Seconds
        long epochMilli = now.toEpochMilli();
        long epochSecond = now.getEpochSecond();
        System.out.println("Current Instant in Epoch Milliseconds: " + epochMilli);
        System.out.println("Current Instant in Epoch Seconds: " + epochSecond);

        // Parse an Instant from a String (ISO-8601 format)
        Instant parsedInstant = Instant.parse("2023-09-15T10:15:30.00Z");
        System.out.println("Parsed Instant: " + parsedInstant);
    }
}
