import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] years = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaries[i] = in.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            years[i] = in.nextDouble();

            if (salaries[i] < 0 || years[i] < 0) {
                System.out.println("Invalid input. Try again.");
                i--; // redo this employee
            }
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5)
                bonuses[i] = salaries[i] * 0.05;
            else
                bonuses[i] = salaries[i] * 0.02;

            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOld += salaries[i];
            totalNew += newSalaries[i];
        }

        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }
}
