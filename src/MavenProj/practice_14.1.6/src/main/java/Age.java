import java.time.LocalDate;
import java.time.Period;

public class Age {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1993, 4, 12);
        System.out.println("My birthday: " + birthday);
        LocalDate dateNow = LocalDate.now();
        Period age = Period.between(birthday, dateNow);
        System.out.println("Age: " + age);
        System.out.println("Formatted: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");
    }
}
