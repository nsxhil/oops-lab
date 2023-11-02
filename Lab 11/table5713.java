public class table5713 {
    public static void main(String[] args) {
        Thread table5Thread = new MultiplicationTableThread(5);
        Thread table7Thread = new MultiplicationTableThread(7);
        Thread table13Thread = new MultiplicationTableThread(13);

        table5Thread.setPriority(Thread.MAX_PRIORITY);

        table5Thread.start();
        table7Thread.start();
        table13Thread.start();
    }
}

class MultiplicationTableThread extends Thread {
    private int number;

    public MultiplicationTableThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
