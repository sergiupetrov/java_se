import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        double celsius;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Fahrenheit: ");
        double fahrenheit = sc.nextInt();

        celsius = (5 * (fahrenheit - 32)) / 9;
        System.out.println("Fahrenheit " + fahrenheit + " to celsius = " + String.format("$%,.2f", celsius));
    }
}
