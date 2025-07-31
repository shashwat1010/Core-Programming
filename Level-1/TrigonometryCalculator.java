import java.util.Scanner;

public class TrigonometryCalculator {

    // Method to calculate sin, cos, tan
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert to radians
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input angle
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Call method
        double[] results = calculateTrigonometricFunctions(angle);

        // Output results
        System.out.printf("sin(%.2f) = %.4f%n", angle, results[0]);
        System.out.printf("cos(%.2f) = %.4f%n", angle, results[1]);
        System.out.printf("tan(%.2f) = %.4f%n", angle, results[2]);

        sc.close();
    }
}
