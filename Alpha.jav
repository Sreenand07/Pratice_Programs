import java.util.*;

public class Alpha{
    public static void main(String[] args) {

      String a= "alphabetical input";
      //         i 
    String vowels = "aeiouAEIOU";
    int count  = 0;
    for(int i=0;i<a.length();i++){
      if(vowels.indexOf(a.charAt(i) )  != -1)
      count++;
    }
    System.out.println(count);
   
    }
}