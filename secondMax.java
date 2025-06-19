import java.util.*;
public class secondMax{
public static void main(String []rt){
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();
  int a[]= new int[n];
for(int i=0;i<n;a[i++]=sc.nextInt());

System.out.print("Before Sort : ");
for(int k:a) System.out.print(k+" ");

  Arrays.sort(a);
  System.out.println();
  
  System.out.print("After Sort :  ");
for(int k:a) System.out.print(k+" ");
  
  int smax = a[n-1] , i= n-1;
  while(a[i] == smax){
    i--;
  }
  smax= a[i];
  
  int smin = a[0];
  i=0;
  while(a[i] == smin){
    i++;
  }
  smin=a[i];
  System.out.println("\nSecond Max is : "+smax);
  System.out.print("Second Min is : "+smin);
  

}
}