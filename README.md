## Problem

CIMB is a digital bank that offers GSave and UpSave savings accounts.   As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%.
The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%.
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.
Benefits include the "Standard Savings Account" plus "with Insurance".

The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name

You should display the following output:
![lab 10 expected output](https://github.com/AeronRedCelajes/decoratorPattern/assets/142370807/a0c4ede7-a11e-435d-b4ee-9861e5ca2a7a)

Description of the following methods

1. <b>showAccountType()</b> - Either returns "Savings Account", "GSave" or "UpSave"
2. <b>getInterestRate()</b> - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave
3. <b>getBalance()</b> - Returns the balance of the account set.
4. <b>showBenefits()</b> - Either returns "Standard Savings Account" for Savings Account; 
<br>benefits offered by savings account + "GSave Transfer";
<br>benefits offered by savings account + "With Insurance";
5. <b>computeBalanceWithInterest()</b> - returns new balance by computing the balance plus the interest depending on the interest rate.
6. <b>showInfo()</b> - Returns details of account number, account name, and balance.

<b>BankAcountDecorator</b> must be an interface.

Follow instructions.  You are not allowed to insert other methods except what is stated in the diagram (setters and getters are allowed).

## Class Diagram
![Decorator Design Pattern](https://github.com/AeronRedCelajes/decoratorPattern/assets/142370807/16f36653-2059-48e1-bd01-9ca519ff3fd5)
