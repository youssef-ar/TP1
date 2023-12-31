
public class Main {
    public static void main(String[] args) {
        // Creating a new BankAccount
        BankAccount account = new BankAccount(123456, "Youssef Aridhi", 1000);

        // Displaying initial account information
        System.out.println("Initial Account Information:");
        account.display();

        // Depositing funds
        account.deposit(500);
        System.out.println("\nAfter depositing 500:");
        account.display();

        // Withdrawing funds
        account.withdraw(200);
        System.out.println("\nAfter withdrawing 200:");
        account.display();

        // Attempting to withdraw more than the balance
        account.withdraw(1500);

        // Displaying final account information
        System.out.println("\nFinal Account Information:");
        account.display();

    }
}
