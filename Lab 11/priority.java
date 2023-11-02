public class priority {
    public static void main(String[] args) {
        Thread lowPriorityThread = new MyThread("Low Priority Thread");
        Thread highPriorityThread = new MyThread("High Priority Thread");

        
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Priority 10

        lowPriorityThread.start();
        highPriorityThread.start();
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
                return; 
            }
        }
    }
}
