import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TimeOperations {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date: " + localDate);

        LocalDate date1 = LocalDate.of(2019, Month.JANUARY, 1);
        LocalDate date2 = LocalDate.of(2050, Month.JANUARY, 1);
//        System.out.println(date.minus(Period.between(2021,01,12;));


        System.out.println("Diff: " + Period.between(date2, date2));
    }
}
