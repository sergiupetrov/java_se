import java.time.LocalTime;

public class Hours {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        time = time.plusHours(2);
        System.out.println(time);
    }
}
