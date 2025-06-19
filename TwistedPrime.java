
import java.util.*;
public class TwistedPrime{

 public static boolean prim(int x){
        for(int i =2;i<Math.sqrt(x);i++){
            if(x%i==0){
                return false;
                
            }
               
            }return true;
 }

            public static int reverse(int x){
                int rev=0;
            while(x>0){
              int  num = x%10;
              rev = (rev*10)+num;
              x/=10;
            } return rev;
            }
            

            public static boolean prime(int rev){
for(int i =2;i<Math.sqrt(rev);i++){
            if(rev%i==0){
                return false;
                
            }   
            }return true;

            }

    public static void main(String[] args) {
        
    
    Scanner Sc =new Scanner(System.in);
    int n =Sc.nextInt();

    boolean res = prim(n);
    System.out.println((res==true)?"Twisted prime":"not a prime");
}
}