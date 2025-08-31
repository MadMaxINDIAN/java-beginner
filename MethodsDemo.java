// Demonstrates methods in Java
public class MethodsDemo {
    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }
    // Method overloading
    public static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        int sum1 = add(2, 3);
        double sum2 = add(2.5, 3.5);
        System.out.println("Sum (int): " + sum1);
        System.out.println("Sum (double): " + sum2);
    }
}
