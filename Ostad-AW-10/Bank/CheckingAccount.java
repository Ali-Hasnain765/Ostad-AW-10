// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 2.5; // Example withdrawal fee for Checking Account

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= (amount + WITHDRAWAL_FEE);
            System.out.println(amount + " withdrawn from Checking Account. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal from Checking Account.");
        }
    }
}