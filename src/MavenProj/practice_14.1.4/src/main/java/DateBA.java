import java.time.LocalDate;
import java.time.Period;

public class DateBA {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate + " MINUS 10 days = " + localDate.minus(Period.ofDays(10)));
        System.out.println(localDate + " PLUS 10 days = " + localDate.plus(Period.ofDays(10)));
    }
}
