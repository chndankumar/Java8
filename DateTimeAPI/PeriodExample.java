import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {
        // Get current date (LocalDate)
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // Custom date (e.g., birthdate)
        LocalDate birthDate = LocalDate.of(1998, 9, 21);
        System.out.println("Custom Date (Birthdate): " + birthDate);

        // Calculate the Period between two dates
        Period age = Period.between(birthDate, today);
        System.out.println("Period between birthdate and today: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " + age.getDays() + " days");

        // Adding a Period to a LocalDate (e.g., 1 year, 3 months, and 10 days)
        Period oneYearThreeMonths = Period.of(1, 3, 10);
        LocalDate futureDate = today.plus(oneYearThreeMonths);
        System.out.println("Future Date (after 1 year, 3 months, 10 days): " + futureDate);

        // Subtracting a Period from a LocalDate (e.g., 2 years)
        Period twoYears = Period.ofYears(2);
        LocalDate pastDate = today.minus(twoYears);
        System.out.println("Past Date (2 years ago): " + pastDate);

        // Creating a Period of specific units
        Period tenDays = Period.ofDays(10);
        System.out.println("Period of 10 days: " + tenDays);

        // Normalize a Period (e.g., 15 months will normalize to 1 year and 3 months)
        Period unnormalizedPeriod = Period.of(0, 15, 0);
        Period normalizedPeriod = unnormalizedPeriod.normalized();
        System.out.println("Unnormalized Period (15 months): " + unnormalizedPeriod);
        System.out.println("Normalized Period: " + normalizedPeriod);

        // Checking if a Period is zero or negative
        Period zeroPeriod = Period.ZERO;
        System.out.println("Is Zero Period? " + zeroPeriod.isZero());

        Period negativePeriod = Period.ofMonths(-3);
        System.out.println("Is Negative Period? " + negativePeriod.isNegative());

        // Comparing two periods
        Period threeYears = Period.ofYears(3);
        Period fiveYears = Period.ofYears(5);

        if (threeYears.getYears() < fiveYears.getYears()) {
            System.out.println("3 years is less than 5 years");
        } else {
            System.out.println("3 years is greater than or equal to 5 years");
        }
    }
}
/*
 * The Period class in Java is used to represent a date-based amount of time,
 * such as a number of years, months, or days. It works with LocalDate
 * instances, and unlike Duration, which deals with time, Period handles
 * date-related differences.
 * 
 * Key Concepts of Period:
 * Creating Period:
 * 
 * You can create a Period using factory methods like Period.ofDays(),
 * Period.ofMonths(), Period.ofYears(), or a combination using Period.of().
 * You can also calculate the Period between two LocalDate instances using
 * Period.between().
 * Adding and Subtracting Period:
 * 
 * LocalDate.plus(Period) or LocalDate.minus(Period) allows you to add or
 * subtract a Period from a LocalDate.
 * Getting Components of Period:
 * 
 * You can retrieve individual components of a Period using .getYears(),
 * .getMonths(), .getDays().
 * Comparing Period:
 * 
 * Period can be compared to check if it is negative, zero, or positive.
 * Other Useful Methods:
 * 
 * Period.isNegative(): Checks if the period represents a negative duration.
 * Period.isZero(): Checks if the period is zero.
 * Period.normalized(): Normalizes a Period (e.g., 15 months would be normalized
 * to 1 year and 3 months).
 */
