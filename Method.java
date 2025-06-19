import java.util.*;
public class Method{
    public static int[] change(int x){
        x[0]=10;
        return x;

    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        arr=change(arr);
        for(int i =0;i<arr.length;System.out.print(arr[i]+" "),i++);
    }
}