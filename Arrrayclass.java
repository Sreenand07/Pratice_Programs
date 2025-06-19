
import java.util.*;
public class Arrrayclass {
	public static void main(String []args){
	     Scanner sc = new Scanner(System.in);
	    // int n= sc.nextInt();
	     int a[]= {1,7,3,0,4,2,8};
	     
	    	     
	     
//	     //toString(int[] a)
	    System.out.println("To String : "+Arrays.toString(a)); // [1,3,2424,]    
	    
	    
//	    	// sort(int[] a)
	     Arrays.sort(a);
	     
	    System.out.println("Sort Array :" + Arrays.toString(a));
   
	       int b1[]= {12,54,23,554,24};
//	 	     //	sort(int[] a, int fromIndex, int toIndex)
	     Arrays.sort(b1,0,4);
	    System.out.println("Range Sort :"+Arrays.toString(b1));
	    
	    
	    
	    
	    
	    
////binarySearch(int[] a, int key)
System.out.println("Binary search all :"+Arrays.binarySearch(a,0)); 
	     
//	 //binarySearch(int[] a, int fromIndex, int toIndex, int key)
System.out.println("Binary search Range :"+Arrays.binarySearch(a,1,4,5));
	     
	     
//	       // a =5
	//     int a[]= {1,23};
       int s[]= {2,3};
//	     //	copyOf(int[] original, int newLength)  //  a, 10
	     int b[]=Arrays.copyOf(s,10);
	    System.out.println("Copying :"+Arrays.toString(b));
   
	    
	    
//	    //	copyOfRange(int[] original, int from, int to)
	    int c[]= Arrays.copyOfRange(a,3,6);
	    System.out.println("Copy of Range :"+Arrays.toString(c));
   
//	   //	fill(int[] a, int val)
	    int d[]=new int[a.length];
	    Arrays.fill(d,-1);
	    System.out.println("Fill :"+Arrays.toString(d));

  
//	//	equals(int[] a, int[] a2)
	    System.out.println("Equals :"+Arrays.equals(a,b));
	        
	  
	 	    }
}
