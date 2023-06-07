import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String pin;
    private double balance;

    public BankAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
}

public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "1234", 1000.0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();
        if (account.validatePin(pin)) {
            System.out.print("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }
        scanner.close();
    }
}
//The provided code represents a basic bank application with added PIN validation for enhanced security. The //BankAccount class includes a PIN variable in addition to the account number and balance. Upon initialization, //the user is prompted to enter their PIN. If the entered PIN matches the stored PIN, the user is allowed to //perform a withdrawal by specifying an amount. If the PIN is invalid, access is denied. This simple application //demonstrates how PIN validation can be incorporated to ensure authorized access to bank accounts and provide an //additional layer of security.




