package business;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * This calculates the age based on birthdate.
 */
public class AgeCalculator {

    public static void main(String... args) {
        calculateAgeAsOfDate();
    }

    public static void calculateAgeAsOfDate() {
        LocalDate birthDate = LocalDate.of(1988, Month.MARCH, 26);

        Period period = Period.between(LocalDate.now(), birthDate);

        System.out.println(period);
    }
}
