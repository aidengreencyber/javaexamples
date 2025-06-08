import java.util.Scanner;

class TestBankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount account1 = new BankAccount();
        BankAccount account2 = getData(input);
        BankAccount account3 = getData(input);
        BankAccount account4 = getData(input); 

        showValues(account1);
        showValues(account2);
        showValues(account3);
        showValues(account4);
    }

    public static BankAccount getData(Scanner input) {
        BankAccount account = new BankAccount();
        System.out.print("Enter Account Number: ");
        account.setAccountNumber(input.nextLine());
        System.out.print("Enter Owner Name: ");
        account.setOwnerName(input.nextLine());
        System.out.print("Enter Balance: ");
        account.setBalance(input.nextDouble());
        input.nextLine(); 
        return account;
    }

    public static void showValues(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance before deduction: $" + account.getBalance());
        account.deductMonthlyFee();
        System.out.println("Balance after deduction: $" + account.getBalance());
        BankAccount.explainAccountPolicy();
        System.out.println();
    }
}