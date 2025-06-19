import java.lang.*;
import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String n = sc.nextLine();
        int f=0;
        for(int i =0,j=n.length()-1;i<=j;i++,j--){
            if(n.charAt(i)!=n.charAt(j)){
                f=1;
                break;
            }
            
        }
        System.out.println((f==0)?"palindrome":"not palindrome");
    }
   
}