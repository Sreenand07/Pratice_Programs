import java.lang.*;
import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String str[]=new String[100];
        String word ="";
        int index=0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt (i);
            if(c!=' '){
                word = word+c;
            }
            else{
                str[index]=word;
                index++;
                word="";

            }
        }
        str[index]=word;
        for(int i =index;i>=0;i--){
            System.out.print(str[i]+" ");
        }
    }
}