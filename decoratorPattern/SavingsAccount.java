package decoratorPattern;

public class SavingsAccount implements BankAccount{
    private int accountNumber;
    private String accountName;
    private Double balance;

    // Setters for account details
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Implementation of BankAccount interface methods
    // Displays Savings Account
    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    // The Interest Rate for UpSave
    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    // Gets the Balance
    @Override
    public Double getBalance() {
        return balance;
    }

    // Displays Standard Savings Account
    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    // The Computed Balance for Savings Account
    @Override
    public Double computeBalanceWithInterest() {
        return balance * (1 + getInterestRate());
    }

    // The info of the user
    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\n" +
                "Account name: " + accountName + "\n" +
                "Balance: " + balance;
    }
}