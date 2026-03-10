package bank;

public class BankAccount {

  private String accountNumber;
  private int balance;

  public BankAccount(String accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  public String toString() {
    return "¥" + this.getBalance() + " (account number: " + this.getAccountNumber() + ")";
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof BankAccount)) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) obj;
    String thisAccountNumber = this.getAccountNumber();
    String otherAccountNumber = bankAccount.getAccountNumber().trim();
    return thisAccountNumber.equals(otherAccountNumber);
  }
}
