
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Set to 0.");
        }
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("Rahul", "123456", 5000);

        account.displayDetails();
        System.out.println();

        // Valid deposit
        account.deposit(1000);

        // Invalid deposits
        account.deposit(-500);
        account.deposit(0);

        // Valid withdrawal
        account.withdraw(2000);

        // Invalid withdrawals
        account.withdraw(0);
        account.withdraw(-300);
        account.withdraw(10000);

        System.out.println("\nUpdated Account Details:");
        account.displayDetails();
    }
}
