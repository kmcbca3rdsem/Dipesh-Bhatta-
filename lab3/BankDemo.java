interface Bank {
    void deposit();
}

class SavingAccount implements Bank {
    public void deposit() {
        System.out.println("Money deposited");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.deposit();
    }
}