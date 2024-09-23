package Account;

public class TestAccount {
    public static void main(String[] args) {
        // Step 2a: Create two accounts
        Account acc1 = new Account("001", "Alice", 5000);
        Account acc2 = new Account("002", "Bob", 4000);

        // Step 2b: Display balance of both accounts
        System.out.println("Initial Balances:");
        System.out.println("Account 1 (Alice): " + acc1.getBalance());
        System.out.println("Account 2 (Bob): " + acc2.getBalance());

        // Step 2c: Transfer $1000 from account 1 to account 2
        acc1.transferTo(acc2, 1000);

        // Step 2d: Display balance of both accounts again
        System.out.println("\nBalances after transfer:");
        System.out.println("Account 1 (Alice): " + acc1.getBalance());
        System.out.println("Account 2 (Bob): " + acc2.getBalance());
    }
}

