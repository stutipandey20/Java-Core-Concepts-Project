package multithreading;

public class BasicRunnableDemo implements Runnable {
    
    private String threadName;

    public BasicRunnableDemo(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred: " + e);
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }

    public static void main(String[] args) {

        // create instances of Runnable
        BasicRunnableDemo task1 = new BasicRunnableDemo("Runnable-1");
        BasicRunnableDemo task2 = new BasicRunnableDemo("Runnable-2");

        // pass runnable instance to Thread constructor
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start the threads
        t1.start();
        t2.start();

    }
}
