import java.util.Scanner;

public class Multiply6to9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int[] result = new int[4];
        for (int i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }
    }
}
