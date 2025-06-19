import java.util.*;
public class Discount{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int amount =sc.nextInt();
System.out.println(amount);
if(amount > 2000){
amount-=200;
}
System.out.println(amount);
}
}
