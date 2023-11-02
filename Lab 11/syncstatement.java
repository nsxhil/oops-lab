import java.util.Scanner;

class Acct {
    private int bal = 0;

    public synchronized void deposit(int amount) {
        System.out.println("Depositing amount: " + amount);
        bal += amount;
        balance();
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Withdrawing amount: " + amount);
        bal -= amount;
        balance();
    }

    public synchronized void balance() {
        System.out.println("Balance: " + bal);
    }
}

class Transaction implements Runnable {
    private Acct acc;
    private int amount;

    public Transaction(Acct acc, int amount) {
        this.acc = acc;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (amount > 0) {
            acc.deposit(amount);
        } else {
            acc.withdraw(-amount);
        }
    }
}

public class syncstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acct account = new Acct();

        Transaction deposit = new Transaction(account, 10000);
        Transaction withdraw = new Transaction(account, 5200);

        Thread t1 = new Thread(deposit);
        Thread t2 = new Thread(withdraw);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
