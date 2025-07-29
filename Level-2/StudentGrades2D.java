import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        // marks[i][0] => physics, marks[i][1] => chemistry, marks[i][2] => maths
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("Physics: ");
            marks[i][0] = in.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = in.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = in.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Please enter again.");
                i--; // Retry this student
                continue;
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else grade[i] = "F";
        }

        System.out.println("\nResult:");
        System.out.println("Student\tPhysics\tChem\tMaths\t% \tGrade");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2]
                    + "\t" + String.format("%.2f", percentage[i]) + "\t" + grade[i]);
        }
    }
}
