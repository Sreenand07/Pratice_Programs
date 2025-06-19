import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
       

        double result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.printf("Result: %.3f\n", result);
                break;

            case '-':
                result = Math.abs(a - b);
                System.out.printf("Result: %.3f\n", result);
                break;

            case '*':
                result = a * b;
                System.out.printf("Result: %.3f\n", result);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by 0 not possible.");
                } else {
                    result = a / b;
                    System.out.printf("Result: %.3f\n", result);
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }
    }
}
