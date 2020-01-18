public class Primitives {
    public static void main(String[] args) {
        long longVar = 1000000000L;
        float floatVar = 4.435F;

        System.out.println("Long variable: " + longVar);
        System.out.println("Float variable: " + floatVar);

        int longToInt = (int) longVar;
        double floatToDouble = (double) floatVar;
        System.out.println("Long to int cast: " + longToInt);
        System.out.println("Float to double cast: " + floatToDouble);
    }
}
