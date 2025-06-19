import java.util.*;
	public class Jaggoured {
	    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   //For 2D Array Row Value is Must.
	    int r = sc.nextInt();
	     int a[][]=new int[r][];
	     //Jagger Array Creation
	       for(int i=0;i<r;i++)
	        a[i]= new int[sc.nextInt()];
	      // Input
	      for(int i=0;i<r;i++){
	        for(int j=0;  j< a[i].length; j++){
	              a[i][j]=sc.nextInt();
	          }
	      }
	      //Output
	      for(int row[] :a){
	          for(int k :  row){
	              System.out.print(k+" ");
	          }
	              System.out.println();
	      }
	        
	    }
	}