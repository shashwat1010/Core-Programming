import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[256]; // ASCII character count
        for (char ch : input.toCharArray()) {
            freq[ch]++;
        }

        char mostFreq = ' ';
        int maxCount = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFreq = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFreq + "'");
    }
}
