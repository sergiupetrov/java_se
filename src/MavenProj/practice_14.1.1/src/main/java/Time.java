import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
//        System.out.println(date1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY HH:mm:ss");
        String formatDateTime = date1.format(formatter);

//        System.out.println(formatter);
        System.out.println(formatter.format(date1));
    }
}