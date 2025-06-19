
import java.util.*;
public class RunTime {
	public static void main(String[] args) {
	     Scanner sc= new Scanner(System.in);
	     // r to store row size c to store column size
	      int r =sc.nextInt(), c= sc.nextInt();
	      // declaring array with r * c Size 
	      int a[][]= new int[r][c];
	      
	      // i loop to select row
	      for(int i=0   ;i<r ;i++){
             // j  loop to select column
	    	  for(int j =0 ; j< c ;j++){
	    		  
	             a[i][j]=sc.nextInt();
	          }
	      }
	      
	      for(int i=0;i<a.length;i++){
	          for(int j=0;j<a[i].length;j++){
	           System.out.print(a[i][j]+" ");
	          }
	           System.out.println();
	          
	        }
	             
	    }
	}

