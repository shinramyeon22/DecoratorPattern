package bankAcc;

public interface BankAccountDecorator {
    void setAccountNumber(int accountNumber);
    void setAccountName(String accountName);
    void setBalance(double balance);
    int getAccountNumber();
    String getAccountName();
    double getBalance();
    String showInfo();
    String showAccountType();
    double getInterestRate();
    double computeBalanceWithInterest();
    String showBenefits();
}