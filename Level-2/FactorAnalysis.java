import java.util.Scanner;

public class FactorAnalysis {

    // Method to get all factors and return as an array
    public static int[] getFactors(int number) {
        int count = 0;

        // First loop to count total number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int num : factors) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate sum of squares of factors
    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int num : factors) {
            sum += Math.pow(num, 2); // can also cast to int if needed
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int num : factors) {
            product *= num;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Get factors array
        int[] factors = getFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display results
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
    }
}
