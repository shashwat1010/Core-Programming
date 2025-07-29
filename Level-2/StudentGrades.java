import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics: ");
            physics[i] = in.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = in.nextInt();
            System.out.print("Maths: ");
            maths[i] = in.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            percent[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 50) grade[i] = "D";
            else grade[i] = "F";
        }

        System.out.println("P\tC\tM\t% \tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(physics[i] + "\t" + chemistry[i] + "\t" + maths[i] + "\t" + percent[i] + "\t" + grade[i]);
        }
    }
}
