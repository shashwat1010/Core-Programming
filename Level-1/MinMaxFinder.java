import java.util.Scanner;

public class MinMaxFinder {

    // Method returns array with [smallest, largest]
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input of 3 numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Call method
        int[] result = findSmallestAndLargest(a, b, c);

        // Display output
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        sc.close();
    }
}
