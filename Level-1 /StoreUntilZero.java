import java.util.Scanner;

public class StoreUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index >= 10) break;

            System.out.print("Enter a number: ");
            double num = in.nextDouble();

            if (num <= 0) break;

            numbers[index] = num;
            index++;
        }

        System.out.println("Entered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total sum: " + total);
    }
}
