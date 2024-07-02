// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 500; // Example withdrawal limit for Savings Account

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= WITHDRAWAL_LIMIT) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Savings Account. Current Balance: " + balance);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient funds for withdrawal from Savings Account.");
        }
    }
}