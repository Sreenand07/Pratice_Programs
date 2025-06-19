import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";

        for (int i = 0; i < a.length(); i += 2) {
            char ch = a.charAt(i);
            int count = a.charAt(i + 1) - '0';  

            b += String.valueOf(ch).repeat(count); 
        }

        System.out.println(b);
    
    }
}