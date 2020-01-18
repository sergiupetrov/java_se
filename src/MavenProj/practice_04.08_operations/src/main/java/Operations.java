import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the first var: ");
        x = sc.nextInt();
        System.out.println("Insert the second var: ");
        y = sc.nextInt();

        int addition = x + y;
        int subs = x - y;
        double multipl = x * y;
        double div = (double) x / (double) y;
        double average = ((double)x + (double) y) / 2;
        double remainder = x % y;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subs);
        System.out.println("Multiplication: " + multipl);
        System.out.println("Division: " + div);
        System.out.println("Average: " + average);
        System.out.println("Remainder: " + remainder);
    }
}
