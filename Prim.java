import java.util.*;
public class Prim{

    public static void prim(){
         Scanner sc = new Scanner(System.in);
         int x=sc.nextInt();
         int f=0;
        for(int i =2;i<Math.sqrt(x);i++){
            if(x%i==0){
                break;
            }
        }
        System.out.println((f==0)?"prime":"not prime");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        prim();
        prim();
    }
}
