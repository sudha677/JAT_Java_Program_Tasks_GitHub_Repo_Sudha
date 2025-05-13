package task6;

public class Account {
    private String accountNumber;
    public String accountHolderName;
    private double balance;

    // No-argument constructor
    public Account() {
    	System.out.println("No-argument Constructor");
        this.accountNumber = "000000";
        this.accountHolderName = "Default User";
        this.balance = 0.0;
            }

    // Two-argument constructor
    public Account(String accountHolderName, double balance) {
    	 System.out.println("Parameterized Constructor");
        this.accountNumber = generateAccountNumber(); // simple ID generation
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        System.out.println("Account Holder Name: "+accountHolderName+ "; Account Number: "+accountNumber+ " ; Original Balance: "+balance);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: £" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: £" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current balance: £" + balance);
    }

    // Getter for balance (optional)
    public double getBalance() {
        return balance;
    }

    // Simple account number generator (static counter or random string could be used)
    private String generateAccountNumber() {
        return "AC" + (int)(Math.random() * 100000);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account();
        acc1.checkBalance();
        acc1.deposit(200);
        acc1.withdraw(50);

        Account acc2 = new Account("Sudha Suresh", 500);
        acc2.checkBalance();
        acc2.deposit(150);
        acc2.withdraw(700);  // Should show insufficient balance
        acc2.withdraw(200);  // Valid
        acc2.checkBalance();


	}

}
