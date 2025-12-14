package bankAcc;

public class UpSave implements BankAccountDecorator {
    private BankAccountDecorator bankAccount;

    public UpSave(BankAccountDecorator bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        bankAccount.setAccountNumber(accountNumber);
    }

    @Override
    public void setAccountName(String accountName) {
        bankAccount.setAccountName(accountName);
    }

    @Override
    public void setBalance(double balance) {
        bankAccount.setBalance(balance);
    }

    @Override
    public int getAccountNumber() {
        return bankAccount.getAccountNumber();
    }

    @Override
    public String getAccountName() {
        return bankAccount.getAccountName();
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() * (1 + getInterestRate());
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }
}
