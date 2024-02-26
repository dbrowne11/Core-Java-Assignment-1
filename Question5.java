package CogentSubmissions;

abstract class Bank {
    int balance = 0;
    abstract int getBalance();

    void deposit(int amount) {
        balance += amount;
    }
}

class BankA extends Bank {

    @Override
    int getBalance() {
        System.out.println("Bank A balance: " + balance);
        return balance;
    }
}

class BankB extends Bank {

    @Override
    int getBalance() {
        System.out.println("Bank B balance: " + balance);
        return balance;
    }
}

class BankC extends Bank {

    @Override
    int getBalance() {
        System.out.println("Bank C balance: " + balance);
        return balance;
    }
}

public class Question5 {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        a.deposit( 100);
        b.deposit(150);
        c.deposit(200);

        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
