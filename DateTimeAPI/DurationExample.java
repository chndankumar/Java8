import java.time.Instant;
import java.time.Duration;

public class DurationExample {

    public static void main(String[] args) {
        // Get the current time (Instant)
        Instant startTime = Instant.now();
        System.out.println("Start Time: " + startTime);

        // Simulate some delay (e.g., 5 seconds)
        Instant endTime = startTime.plusSeconds(5);
        System.out.println("End Time (5 seconds later): " + endTime);

        // Calculate the Duration between start and end time
        Duration durationBetween = Duration.between(startTime, endTime);
        System.out.println("Duration between start and end: " + durationBetween.getSeconds() + " seconds");

        // Adding a Duration to an Instant
        Duration fiveMinutes = Duration.ofMinutes(5);
        Instant newTime = startTime.plus(fiveMinutes);
        System.out.println("Start time plus 5 minutes: " + newTime);

        // Subtracting a Duration from an Instant
        Duration tenSeconds = Duration.ofSeconds(10);
        Instant subtractedTime = startTime.minus(tenSeconds);
        System.out.println("Start time minus 10 seconds: " + subtractedTime);

        // Convert Duration to different units
        long millis = durationBetween.toMillis();
        long nanos = durationBetween.toNanos();
        System.out.println("Duration in milliseconds: " + millis);
        System.out.println("Duration in nanoseconds: " + nanos);

        // Creating a Duration of specific time
        Duration customDuration = Duration.ofDays(1);
        System.out.println("Custom Duration (1 day): " + customDuration);

        // Check if duration is zero or negative
        Duration zeroDuration = Duration.ZERO;
        System.out.println("Is Zero Duration? " + zeroDuration.isZero());

        Duration negativeDuration = Duration.ofMinutes(-2);
        System.out.println("Is Negative Duration? " + negativeDuration.isNegative());

        // Comparing two Durations
        Duration tenMinutes = Duration.ofMinutes(10);
        Duration fifteenMinutes = Duration.ofMinutes(15);

        if (tenMinutes.compareTo(fifteenMinutes) < 0) {
            System.out.println("10 minutes is less than 15 minutes");
        } else {
            System.out.println("10 minutes is greater than or equal to 15 minutes");
        }
    }
}
/*
 * Duration is a class in Java that represents the time-based amount between two
 * Instant or LocalTime instances. It can be used to work with time intervals in
 * seconds and nanoseconds. Below, I'll give you the key methods and concepts
 * related to Duration and how to apply them when working with Instant.
 * 
 * Key Concepts of Duration:
 * Creating Duration:
 * 
 * You can create a Duration using factory methods like Duration.ofSeconds(),
 * Duration.ofMinutes(), etc.
 * You can also calculate the Duration between two Instant instances using
 * Duration.between().
 * Adding and Subtracting Duration:
 * 
 * Instant.plus(Duration) or Instant.minus(Duration) allows you to add or
 * subtract a Duration from an Instant.
 * Converting Duration:
 * 
 * Duration can be converted into days, hours, minutes, seconds, or milliseconds
 * using methods like .toDays(), .toHours(), .toMinutes(), .toMillis().
 * Comparing Duration:
 * 
 * You can compare durations using .isZero(), .isNegative(), or compare two
 * durations with .compareTo().
 * Other Useful Methods:
 * 
 * Duration.getSeconds() returns the number of seconds in the duration.
 * Duration.getNano() gives the nanoseconds part of the duration.
 */
