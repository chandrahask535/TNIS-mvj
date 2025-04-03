package bank_account;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Transaction declined: insufficient funds");
        }
    }

    public void displayOverdraftLimit() {
        System.out.println("Overdraft limit: " + overdraftLimit);
    }
}

