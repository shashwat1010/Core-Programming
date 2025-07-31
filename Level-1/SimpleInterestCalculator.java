import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take input for Principal
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        // Take input for Rate of interest
        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble();

        // Take input for Time in years
        System.out.print("Enter Time in years: ");
        double time = sc.nextDouble();

        // Call the method to calculate simple interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Print the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n",
                          interest, principal, rate, time);

        // Close the scanner
        sc.close();
    }
}
