

public class ThreadStatusDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();

        // Check the status of thread1
        if (thread1.isAlive()) {
            System.out.println(thread1.getName() + " is still running.");
        }

        // Wait for thread1 to finish using the join() method
        thread1.join();
        System.out.println(thread1.getName() + " has finished.");

        // Check the status of thread2
        if (thread2.isAlive()) {
            System.out.println(thread2.getName() + " is still running.");
        }
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": Count " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }
}
