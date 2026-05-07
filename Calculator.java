import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = 0;

            if(op == '+') result = a + b;
            else if(op == '-') result = a - b;
            else if(op == '*') result = a * b;
            else if(op == '/') {
                if(b != 0) result = a / b;
                else System.out.println("Cannot divide by zero");
            }
            else System.out.println("Invalid operator");

            System.out.println("Result = " + result);

            System.out.print("Continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        sc.close();
    }
}
