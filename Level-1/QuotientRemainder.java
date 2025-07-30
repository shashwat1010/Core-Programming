import java.util.Scanner;

public class QuotientRemainder {

    // Method to return both quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Call method and get result
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display quotient and remainder
        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);

        sc.close();
    }
}
