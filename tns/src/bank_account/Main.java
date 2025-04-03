package bank_account;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000.0, 5.0);
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.addInterest();
        System.out.println("Savings account balance: " + savingsAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(67890, 500.0, 1000.0);
        checkingAccount.deposit(300.0);
        checkingAccount.withdraw(800.0);
        checkingAccount.displayOverdraftLimit();
        System.out.println("Checking account balance: " + checkingAccount.getBalance());
    }
}

