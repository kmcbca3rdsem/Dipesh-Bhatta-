class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    int balance = 1000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdraw successful");
        }
    }
}

public class BankExceptionDemo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        try {
            b.withdraw(2000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}