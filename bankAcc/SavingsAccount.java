package bankAcc;

public class SavingsAccount implements BankAccountDecorator {
    private int accountNumber;
    private String accountName;
    private double balance;

    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showInfo() {
        return "Account number: " + getAccountNumber() + "\n" +
                "Account name: " + getAccountName() + "\n" +
                "Balance: " + getBalance();
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() * (1 + getInterestRate());
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }
}