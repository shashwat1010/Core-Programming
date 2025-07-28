import java.util.Scanner;

class FactorialFor {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      if (number >= 0) {
         int factorial = 1;
         for (int i = 1; i <= number; i++) {
            factorial *= i;
         }
         System.out.println("Factorial: " + factorial);
      } else {
         System.out.println("Invalid input");
      }
      input.close();
   }
}
