import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        int minutes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert minutes: ");
        minutes = sc.nextInt();

        System.out.println("Minutes: " + minutes);
        System.out.println("Converted to days: " + (double) minutes / 1440);
        System.out.println("Converted to years: " + (double) minutes / 525950);
    }
}