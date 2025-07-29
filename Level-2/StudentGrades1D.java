import java.util.Scanner;

public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("Physics: ");
            physics[i] = in.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = in.nextInt();

            System.out.print("Maths: ");
            maths[i] = in.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Please enter again.");
                i--; // Retry this student
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else grade[i] = "F";
        }

        System.out.println("\nResult:");
        System.out.println("Student\tPhysics\tChem\tMaths\t% \tGrade");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + physics[i] + "\t" + chemistry[i] + "\t" + maths[i]
                    + "\t" + String.format("%.2f", percentage[i]) + "\t" + grade[i]);
        }
    }
}
