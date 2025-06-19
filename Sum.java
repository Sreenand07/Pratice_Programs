import java.util.*;
public class Sum{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int digit =sc.nextInt();
int last = digit%10;
int secondLast=(digit/10)%10;
int sum =last + secondLast;
System.out.println(sum);
}
}