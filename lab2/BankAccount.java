class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 101;
        b.balance = 1000;

        b.deposit(500);
        b.withdraw(300);
        b.displayBalance();
    }
}
