import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed in miles/hour: ");
        double windSpeed = sc.nextDouble();

        // Calculation
        double windChill = calculateWindChill(temperature, windSpeed);

        // Output
        System.out.printf("The Wind Chill is: %.2f°F%n", windChill);

        sc.close();
    }
}
