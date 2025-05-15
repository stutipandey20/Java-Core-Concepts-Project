package multithreading;

/*
 * This code demonstrates basic multithreading in Java by creating a class that extends the Thread class. 
 * Two threads are started, and each one runs its own loop, printing messages to the console with a delay.
 * 
 * @author: Stuti Pandey
 * @date: May 13, 2025
 */

// Class that extends the Thread class to create a custom thread
public class BasicThreadDemo extends Thread {

    private String threadName;  // Each thread will have a custom name for identification

    // Constructor to set the thread name
    public BasicThreadDemo(String name) {
        threadName = name;
    }

    // The code inside the run() is what the thread is supposed to do
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i); // print the count and thread name
            try {
                Thread.sleep(500); // pause the thread for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Exception occured: " + e);
                System.out.println(threadName + " interrupted.");   // Handle thread interruption
            }
        }
        System.out.println(threadName + " finished.");  // Print once the loop is done
    }

    // Main method: Entry point of the program
    public static void main (String[] args) {
        // Create two thread instances with different names
        BasicThreadDemo t1 = new BasicThreadDemo("Thread-1");
        BasicThreadDemo t2 = new BasicThreadDemo("Thread-2");

        // Start both threads (they run independently and concurrently)
        t1.start();
        t2.start();
    }
}
