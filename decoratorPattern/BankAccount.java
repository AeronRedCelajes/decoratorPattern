package decoratorPattern;

public interface BankAccount {
    // Interface defining common methods for all bank accounts
    String showAccountType();
    double getInterestRate();
    double getBalance();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
}