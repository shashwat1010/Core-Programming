import java.util.Scanner;

class FizzBuzzUsingWhile {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      int i = 1;
      if (number > 0) {
         while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
               System.out.println("Fizz");
            } else if (i % 5 == 0) {
               System.out.println("Buzz");
            } else {
               System.out.println(i);
            }
            i++;
         }
      }
      input.close();
   }
}
