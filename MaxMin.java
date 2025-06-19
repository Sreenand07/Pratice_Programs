import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        scanner.close();

        int maxDigit = Integer.MIN_VALUE;
        int minDigit = Integer.MAX_VALUE;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit > maxDigit) maxDigit = digit;
            if (digit < minDigit) minDigit = digit;
        }

        System.out.println(maxDigit + " " + minDigit);
    }
}
