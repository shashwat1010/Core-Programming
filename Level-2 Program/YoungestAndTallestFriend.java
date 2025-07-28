import java.util.Scanner;

class YoungestAndTallestFriend {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int age1 = input.nextInt();
      double height1 = input.nextDouble();
      int age2 = input.nextInt();
      double height2 = input.nextDouble();
      int age3 = input.nextInt();
      double height3 = input.nextDouble();

      if (age1 <= age2 && age1 <= age3) {
         System.out.println("Youngest: Amar");
      } else if (age2 <= age1 && age2 <= age3) {
         System.out.println("Youngest: Akbar");
      } else {
         System.out.println("Youngest: Anthony");
      }

      if (height1 >= height2 && height1 >= height3) {
         System.out.println("Tallest: Amar");
      } else if (height2 >= height1 && height2 >= height3) {
         System.out.println("Tallest: Akbar");
      } else {
         System.out.println("Tallest: Anthony");
      }

      input.close();
   }
}
