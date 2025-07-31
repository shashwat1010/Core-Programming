import java.util.Scanner;

public class SpringSeason {

    // Method to check if it's Spring Season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || // From March 20
               (month == 4) ||
               (month == 5) ||
               (month == 6 && day <= 20);   // Till June 20
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Check and display result
        if (isSpringSeason(month, day))
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");

        sc.close();
    }
}
