import java.util.Scanner;

class RocketLaunchFor {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int counter = input.nextInt();
      for (int i = counter; i >= 1; i--) {
         System.out.println(i);
      }
      input.close();
   }
}
