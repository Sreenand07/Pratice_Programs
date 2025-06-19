import java.util.*;
public class Second{
public static void main(String []rt){
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();
  int a[]= new int[n];
for(int i=0;i<n;a[i++]=sc.nextInt());

   int max = a[0] , second =a[0];
   for(int i=0;i<n;i++){
       if(a[i] > max){
            second   = max ;
            max = a[i];
       }
       else if(a[i] < max  && a[i] > second){
           second= a[i];
       }
   }
   System.out.println("Maximum : "+max);
   System.out.println("Second Maximum : "+second);

   int min= a[0] , secondm =a[0];
   for(int i=0;i<n;i++){
       if(a[i] > max){
            second   = max ;
            max = a[i];
       }
       else if(a[i] < max  && a[i] > second){
           second= a[i];
       }
   }
   System.out.println("Maximum : "+max);
   System.out.println("Second Maximum : "+second);



}

}



