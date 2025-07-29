import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (number != 0) {
            if (index == digits.length) break;
            digits[index++] = number % 10;
            number /= 10;
        }

        int max = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > max) {
                second = max;
                max = digits[i];
            } else if (digits[i] > second && digits[i] != max) {
                second = digits[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + second);
    }
}
