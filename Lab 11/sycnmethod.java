public class sycnmethod {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new MyThread("Thread 1", sharedResource);
        Thread thread2 = new MyThread("Thread 2", sharedResource);

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    
    public synchronized void doWork(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": Count " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
    }
}

class MyThread extends Thread {
    private SharedResource sharedResource;

    public MyThread(String name, SharedResource resource) {
        super(name);
        this.sharedResource = resource;
    }

    public void run() {
        sharedResource.doWork(getName());
    }
}
