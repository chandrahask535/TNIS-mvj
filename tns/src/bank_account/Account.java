package bank_account;
public abstract class Account {
    protected double balance;
    protected int accountNumber;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public double getBalance() {
        return balance;
    }
}

