import java.util.Scanner;
class TotalPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int qty = input.nextInt();
        System.out.print("Enter unit price: ");
        double price = input.nextDouble();
        double total = qty * price;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + qty + " and unit price is INR " + price);
    }
}
