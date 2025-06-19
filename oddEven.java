import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        
        for (int num : a) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        
        System.out.println( evenCount);
        System.out.println( oddCount);

        
    }
}
