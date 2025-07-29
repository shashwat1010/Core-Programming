import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is positive and even.");
                else
                    System.out.println(num + " is positive and odd.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("Number is zero.");
            }
        }

        if (numbers[0] == numbers[4])
            System.out.println("First and last numbers are equal.");
        else if (numbers[0] > numbers[4])
            System.out.println("First number is greater than the last.");
        else
            System.out.println("First number is less than the last.");
    }
}
