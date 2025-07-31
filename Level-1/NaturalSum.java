import java.util.Scanner;

public class NaturalSum {

    // Method to calculate sum using loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // Calculate and print sum
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
