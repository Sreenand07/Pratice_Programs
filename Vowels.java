import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter char: ");
        String input = sc.next();
        char ch = input.charAt(0);


if(ch=='A'||ch=='a'||ch=='E'||ch='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
System.out.println("vowels");
}else{
System.out.println("Consonent");
}
}
}
