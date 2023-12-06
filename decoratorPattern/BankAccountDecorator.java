package decoratorPattern;

public interface BankAccountDecorator extends BankAccount{
    // Interface extending BankAccount with a method for setting the underlying account
    void setBankAccount(BankAccount bankAccount);
}