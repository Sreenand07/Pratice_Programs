import java.util.*;
public class MinMax{
public static void main(String []rt){
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();
  int a[]= new int[n];
for(int i=0;i<n;a[i++]=sc.nextInt());

System.out.print("Before Sort : ");
for(int k:a) System.out.print(k+" ");

  Arrays.sort(a);
  System.out.println();
  
System.out.print("After Sort : ");
for(int k:a) System.out.print(k+" ");

  System.out.println();
System.out.print("result : \nMin :" +a[0]+" ,Max :"+a[n-1]);
  

}
}