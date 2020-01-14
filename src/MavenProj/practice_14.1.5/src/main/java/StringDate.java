import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDate {
    public static void main(String[] args) throws ParseException {
        String sDate = "Jan 1,2020";
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd,yyyy");
        Date date = formatter.parse(sDate);
        System.out.println("String: " + sDate);
        System.out.println("Converted String to date: " + formatter.format(date));
    }
}
