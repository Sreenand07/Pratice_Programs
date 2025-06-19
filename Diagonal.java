import java.util.*;
public class Diagonal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
            int lsum=0,rsum=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                        lsum+=a[i][j];
                    }
                        if(i+j==n-1){
                            rsum+=a[i][j];

                        }
                    }
                    System.out.println(lsum+ " "+rsum);

                }
            }
        }