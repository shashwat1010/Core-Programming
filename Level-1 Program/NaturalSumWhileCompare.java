import java.util.Scanner;

class NaturalSumWhileCompare {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      if (number > 0) {
         int sum = 0;
         int i = 1;
         while (i <= number) {
            sum += i;
            i++;
         }
         int formulaSum = number * (number + 1) / 2;
         System.out.println("Sum using loop: " + sum);
         System.out.println("Sum using formula: " + formulaSum);
      } else {
         System.out.println("Not a natural number");
      }
      input.close();
   }
}
