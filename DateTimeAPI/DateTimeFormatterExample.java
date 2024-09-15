package Java8.DateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExample {

    public static void main(String[] args) {
        // 1. Formatting LocalDate
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(dateFormatter);
        System.out.println("Formatted LocalDate: " + formattedDate);

        // 2. Parsing LocalDateTime from a String
        String dateTimeString = "15-09-2024 14:30";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println("Parsed LocalDateTime: " + parsedDateTime);

        // 3. Using Predefined ISO Formatters
        LocalDateTime currentDateTime = LocalDateTime.now();
        String isoFormattedDate = currentDateTime.format(DateTimeFormatter.ISO_DATE);
        String isoFormattedTime = currentDateTime.format(DateTimeFormatter.ISO_TIME);
        System.out.println("ISO Formatted Date: " + isoFormattedDate);
        System.out.println("ISO Formatted Time: " + isoFormattedTime);

        // 4. Formatting and Parsing ZonedDateTime with Time Zone
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        DateTimeFormatter zonedFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedZonedDateTime = currentZonedDateTime.format(zonedFormatter);
        System.out.println("Formatted ZonedDateTime: " + formattedZonedDateTime);

        String zonedDateTimeString = "2024-09-15 14:30:45 IST";
        ZonedDateTime parsedZonedDateTime = ZonedDateTime.parse(zonedDateTimeString, zonedFormatter);
        System.out.println("Parsed ZonedDateTime: " + parsedZonedDateTime);

        // 5. Formatting and Parsing LocalDateTime (Date and Time together)
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(dateTimeFormatter2);
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);

        // 6. Formatting with Locale (French Locale)
        DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
        String formattedFrenchDate = currentDateTime.format(frenchFormatter);
        System.out.println("Formatted DateTime with French Locale: " + formattedFrenchDate);

        // 7. Handling Optional Parts (Optional Time)
        String dateOnlyString = "2024-09-15";
        DateTimeFormatter optionalTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd[ HH:mm:ss]");
        LocalDateTime dateTimeWithOptionalTime = LocalDateTime.parse(dateOnlyString + " 14:30:00",
                optionalTimeFormatter);
        System.out.println("Parsed LocalDateTime with Optional Time: " + dateTimeWithOptionalTime);

        // ---- Working with Duration ----
        // 8. Duration between two Instants
        Instant startInstant = Instant.now();
        Instant endInstant = startInstant.plus(Duration.ofHours(5)); // Add 5 hours
        Duration duration = Duration.between(startInstant, endInstant);
        System.out.println("Duration between start and end: " + duration);

        // 9. Adding Duration to LocalTime
        LocalTime nowTime = LocalTime.now();
        LocalTime futureTime = nowTime.plus(Duration.ofMinutes(30));
        System.out.println("Time after 30 minutes: " + futureTime);

        // ---- Working with Period ----
        // 10. Period between two LocalDates
        LocalDate pastDate = LocalDate.of(2020, 9, 15);
        LocalDate futureDate = LocalDate.of(2024, 9, 15);
        Period periodBetween = Period.between(pastDate, futureDate);
        System.out.println("Period between past and future date: " + periodBetween.getYears() + " years, " +
                periodBetween.getMonths() + " months, " + periodBetween.getDays() + " days");

        // 11. Adding Period to LocalDate
        LocalDate currentDatePlusPeriod = currentDate.plus(Period.ofMonths(6)); // Add 6 months
        System.out.println("Date after 6 months: " + currentDatePlusPeriod);
    }
    /*
     * Formatting LocalDate:
     * 
     * Demonstrates formatting the current date in the dd/MM/yyyy pattern.
     * Parsing LocalDateTime from a String:
     * 
     * Parses a string of date and time into a LocalDateTime object.
     * Predefined ISO Formatters:
     * 
     * Uses predefined ISO_DATE and ISO_TIME formatters to format the current date
     * and time.
     * Formatting and Parsing ZonedDateTime with Time Zone:
     * 
     * Formats and parses ZonedDateTime with a time zone (IST in this case).
     * Combining Date and Time (LocalDateTime):
     * 
     * Formats LocalDateTime using both date and time in a single string.
     * Using Locale for Formatting:
     * 
     * Formats the current date in French using the Locale.FRENCH setting.
     * Handling Optional Parts in Formatting:
     * 
     * Demonstrates optional parts in a date-time format (e.g., time may be
     * missing).
     * Duration Between Two Instants:
     * 
     * Calculates and prints the duration between two Instant objects.
     * Adding Duration to LocalTime:
     * 
     * Adds 30 minutes to the current LocalTime.
     * Period Between Two LocalDates:
     * 
     * Calculates the period (difference) between two dates in years, months, and
     * days.
     * Adding Period to LocalDate:
     * Adds 6 months to the current date.
     */
}
