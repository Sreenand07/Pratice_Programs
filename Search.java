import java.util.Scanner;

public class Search{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element " + searchElement + " found at index " + i);
                return; 
            }
        }

        
        System.out.println("Element " + searchElement + " not found in the array.");

        scanner.close();
    }
}
