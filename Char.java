import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter char: ");
        String input = sc.next();
        char ch = input.charAt(0);

        if (ch == 'h') {
            System.out.println("head");
        } else if (ch == 't') {
            System.out.println("tail");
        } else if (ch == 'H') {
            System.out.println("HEAD");
        } else if (ch == 'T') {
            System.out.println("TAIL");
        } else {
            System.out.println("Invalid input");
        }

        
    }
}
