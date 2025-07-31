import java.util.Scanner;

public class ChocolateDivider {

    // Same method as quotient & remainder
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int eachChildGets = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachChildGets, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        // Get result
        int[] result = findRemainderAndQuotient(chocolates, children);

        // Output
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}
