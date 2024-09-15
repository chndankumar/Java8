package Java8.DateTimeAPI;

import java.time.*;
import java.util.*;

public class ZoneTimeDateExample {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        ZoneId zone = now.getZone();
        System.out.println(now);

        // Set<String> availableTimeZoneIDs = ZoneId.getAvailableZoneIds();
        // availableTimeZoneIDs.forEach(x -> System.out.println(x));
        // availableTimeZoneIDs.forEach(System.out::println);

        ZonedDateTime cusZonedDateTime = ZonedDateTime.of(2000, 10, 21, 21, 51, 11, 27,
                ZoneId.of("Australia/Lindeman"));
        System.out.println(cusZonedDateTime);

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYorkTime);

        ZonedDateTime parsZonedDateTime = ZonedDateTime.parse("2024-09-15T04:02:34.352025300-04:00[America/New_York]");
        System.out.println(parsZonedDateTime);

    }
}
