import java.util.Scanner;
public class SubjectGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        double avg = (physics + chemistry + maths) / 3.0;
        System.out.println("Average: " + avg);
        if (avg >= 90) {
            System.out.println("Grade: A+");
        } else if (avg >= 80) {
            System.out.println("Grade: A");
        } else if (avg >= 70) {
            System.out.println("Grade: B+");
        } else if (avg >= 60) {
            System.out.println("Grade: B");
        } else if (avg >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
