import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char removeChar = sc.next().charAt(0);

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != removeChar) {
                result.append(ch);
            }
        }

        System.out.println("Modified String: " + result);
    }
}
