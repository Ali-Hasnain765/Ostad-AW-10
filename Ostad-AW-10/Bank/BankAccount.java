// Base class BankAccount
class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal from Bank Account.");
        }
    }

    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(600);

        System.out.println();

        BankAccount checkingAccount = new CheckingAccount(1500);
        checkingAccount.deposit(300);
        checkingAccount.withdraw(400);
        checkingAccount.withdraw(1600);
    }
}