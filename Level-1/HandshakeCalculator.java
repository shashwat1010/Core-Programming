import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        // Using combination formula: n * (n - 1) / 2
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate total handshakes
        int totalHandshakes = calculateHandshakes(numberOfStudents);

        // Output the result
        System.out.println("Maximum number of handshakes = " + totalHandshakes);

        sc.close();
    }
}
