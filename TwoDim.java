public class TwoDim {
	    public static void main(String[] args) {
	     int row=3,column=3;
	     int a[][]= {   {1,2,3},
	                    {4,5,6},
	                    {7,8,9}    };	
	     int b[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}}; 
	     int e[][]= new int[row][column];
	     e[0][0]=12;      e[0][1]=23;
	     e[0][2]=34;
	     e[1][0]=45;
	     e[1][1]=56;
	     e[1][2]=67;
	     e[2][0]=78;
	     e[2][1]=89;
	     e[2][2]=90;
	   int f[][];
	     f= new int[3][3];
	     
	     // int b[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}}; 
	    int c[][]= {{1,2,3},{4,5,6},{7,8,9}};
	    /* int d[][]= new int[row][column]{{1,2,3},{4,5,6},{7,8,9}}; 
	     error: array creation with both dimension expression and
	    initialization is illegal*/
	     
	     for(int i[]: a ) {
	    	 for(int j :i) {
	    System.out.print(j+" ");
	    	 }
	    	 System.out.println();
	     }
	        
	  }
	}
