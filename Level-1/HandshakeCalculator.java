import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Calculate handshakes using formula
        int handshakes = calculateHandshakes(students);

        // Display the result
        System.out.println("Maximum number of handshakes: " + handshakes);

        sc.close();
    }
}
