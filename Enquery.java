import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Enquery{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber);

        while (true) {
            System.out.println("Bank Account Management");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println();
        }
    }
}

//The Enquiry class contains the main method where the program execution begins. It creates a Scanner object to //read user input from the console.

//The program prompts the user to enter an account number and creates a BankAccount object with the provided //account number.

//Inside the while loop, the program displays a menu of options for the user to choose from: deposit, withdraw, //display balance, or exit. The user's choice is read using the nextInt() method.

//Based on the user's choice, the program prompts for additional inputs (deposit amount or withdrawal amount) and //calls the respective methods of the BankAccount object.

//If the user chooses to exit, the program prints a message and returns, terminating the program.

//That's a brief overview of the code. It allows users to manage a bank account by performing operations like //deposit, withdrawal, and checking the balance.






