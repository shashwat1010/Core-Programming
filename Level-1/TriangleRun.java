import java.util.Scanner;

public class TriangleRun {

    // Method to calculate number of rounds needed to complete 5 km
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter); // Use ceil to complete the distance
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for 3 sides of the triangle
        System.out.print("Enter side A in meters: ");
        double a = sc.nextDouble();

        System.out.print("Enter side B in meters: ");
        double b = sc.nextDouble();

        System.out.print("Enter side C in meters: ");
        double c = sc.nextDouble();

        // Calculate rounds
        int rounds = calculateRounds(a, b, c);

        // Display result
        System.out.println("Number of rounds needed to complete 5 km: " + rounds);

        sc.close();
    }
}
