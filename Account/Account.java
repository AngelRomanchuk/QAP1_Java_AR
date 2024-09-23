package Account;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // Constructors
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Gets and Sets
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        balance += amount;
        return balance;
    }

    public int debit(int amount){
        if (amount<=balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= this.balance) {
            this.balance -= amount; // Deduct from current account
            another.balance += amount; // Add to another account
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return this.balance;
    }

    public String toString(){
        return "Account: id is " + id + ", name is " + name + ", balance is " + balance + ".";
    }
}