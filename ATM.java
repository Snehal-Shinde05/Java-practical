import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;

        try {
            System.out.println("1.Check Balance\n2.Deposit\n3.Withdraw");
            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("Balance = " + balance);
            }
            else if(choice == 2) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                if(amt <= 0) throw new IllegalArgumentException();
                balance += amt;
                System.out.println("Updated Balance = " + balance);
            }
            else if(choice == 3) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                if(amt > balance) throw new ArithmeticException();
                balance -= amt;
                System.out.println("Remaining Balance = " + balance);
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Insufficient funds!");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
        finally {
            System.out.println("Thank you for using ATM");
        }

        sc.close();
    }
}
