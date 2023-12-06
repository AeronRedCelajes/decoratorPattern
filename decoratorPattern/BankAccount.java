package decoratorPattern;

public interface BankAccount {
    // Interface defining common methods for all bank accounts
    String showAccountType();
    Double getInterestRate();
    Double getBalance();
    String showBenefits();
    Double computeBalanceWithInterest();
    String showInfo();
}