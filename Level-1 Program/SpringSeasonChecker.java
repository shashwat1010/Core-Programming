import java.util.Scanner;

class SpringSeasonChecker {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int month = input.nextInt();
      int day = input.nextInt();
      boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
      System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
      input.close();
   }
}
