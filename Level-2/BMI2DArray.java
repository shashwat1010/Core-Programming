import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = in.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            personData[i][0] = in.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][1] = in.nextDouble();

            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + "\t" + personData[i][1] + "\t" + String.format("%.2f", personData[i][2]) + "\t" + status[i]);
        }
    }
}
