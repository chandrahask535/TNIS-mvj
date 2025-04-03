package bank_account;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }
}

