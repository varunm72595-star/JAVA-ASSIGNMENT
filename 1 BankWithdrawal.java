import java.util.Scanner;

// User-defined exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankWithdrawal {

    static void withdraw(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds. Withdrawal amount exceeds balance.");
        }

        balance -= amount;
        System.out.println("Withdrawal Successful.");
        System.out.println("Updated Balance = " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {
            withdraw(balance, amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        sc.close();
    }
}