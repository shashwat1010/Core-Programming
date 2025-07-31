import java.util.Scanner;

public class NumberCheck {

    // Method to check number type
    public static int checkNumber(int number) {
        if (number > 0) return 1;       // Positive
        else if (number < 0) return -1; // Negative
        else return 0;                  // Zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check and display result
        int result = checkNumber(num);

        if (result == 1) System.out.println("The number is Positive");
        else if (result == -1) System.out.println("The number is Negative");
        else System.out.println("The number is Zero");

        sc.close();
    }
}
