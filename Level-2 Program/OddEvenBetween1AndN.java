import java.util.Scanner;

class OddEvenBetween1AndN {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      if (number >= 1) {
         for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
               System.out.println(i + " is Even");
            } else {
               System.out.println(i + " is Odd");
            }
         }
      }
      input.close();
   }
}
