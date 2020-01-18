public class ManipNumb {
    public static void main(String[] args) {
        double price = 15;
        double tax = 16;
        int quantity = 6;
        double total;

        System.out.println("I want to buy " + quantity + " shirt!");
        total = price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);
    }
}