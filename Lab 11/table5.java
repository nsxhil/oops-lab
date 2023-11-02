class MultiplicationTable implements Runnable {
    private int multiplier;

    public MultiplicationTable(int multiplier) {
        this.multiplier = multiplier;
    }

    public void run() {
        synchronized (this) { // Synchronize on the current instance
            System.out.println("Multiplication table for " + multiplier + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(multiplier + " x " + i + " = " + (multiplier * i));
            }
        }
    }
}

public class table5 {
    public static void main(String[] args) {
        MultiplicationTable table5 = new MultiplicationTable(5);
        MultiplicationTable table7 = new MultiplicationTable(7);
        MultiplicationTable table13 = new MultiplicationTable(13);

        Thread table5Thread = new Thread(table5);
        Thread table7Thread = new Thread(table7);
        Thread table13Thread = new Thread(table13);

        table5Thread.start();
        table7Thread.start();
        table13Thread.start();


        System.out.println("All tables are generated.");
    }
}
