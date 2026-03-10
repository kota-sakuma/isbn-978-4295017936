package bank;

public class Main {

  public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount("1234567890", 10000);
    BankAccount bankAccount2 = new BankAccount(" 1234567890", 10000);
    System.out.print("Comparing bankAccount1 and bankAccount2: ");
    System.out.println(bankAccount1.equals(bankAccount2));

    BankAccount bankAccount3 = new BankAccount("0123456789", 10000);
    System.out.print("Comparing bankAccount1 and bankAccount3: ");
    System.out.println(bankAccount1.equals(bankAccount3));
  }
}
