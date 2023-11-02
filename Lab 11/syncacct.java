import java.util.Scanner;
class Acct{
    static int bal =0;
    synchronized void balance(){
        System.out.println("Balance: " + bal);
    }
}

class withdraw implements Runnable{
    Thread t;
    Acct acc;
    int draw;
    withdraw(Acct acc, int x){
        this.acc = acc;
        t = new Thread(this );
        this.draw = x;
        t.start();
    }
    synchronized public void run(){
        System.out.println("Withdrawn amount.");
        acc.bal = acc.bal - draw;
        acc.balance();

    }
}
class deposit implements Runnable{
    Thread t; 
    Acct acc;
    int x;
    deposit(Acct acc, int x){
        this.acc = acc;
        t = new Thread(this);
        this.x =x;
        t.start();
    }
    synchronized public void run(){
        System.out.println("Deposited amount.");
        acc.bal = acc.bal + x;
        acc.balance();
    }
}

public class syncacct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acct ac = new Acct();
        deposit t1 = new deposit(ac, 10000);
        withdraw t2 = new withdraw(ac, 5200);

    }
}