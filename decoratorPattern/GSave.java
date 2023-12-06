package decoratorPattern;

public class GSave implements BankAccountDecorator{
    private BankAccount bankAccount;

    // Constructor that associates a GSave with an existing bank account
    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Method to set the underlying bank account
    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Implementation of BankAccount interface methods
    // Displays GSave
    @Override
    public String showAccountType() {
        return "GSave";
    }

    // The Interest Rate for UpSave
    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    // Gets the Balance
    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    // Displays Standard Savings Account, GCash Transfer
    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    // The Computed Balance for GSave
    @Override
    public Double computeBalanceWithInterest() {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }

    // The info of the user
    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}