package multithreading;

public class OddEvenPrinter {

    private static final int MAX = 20;
    private int number = 1;
    private final Object lock = new Object();

    // Thread to print odd numbers
    class OddThread implements Runnable {
        public void run() {
            while (number <= MAX) {
                synchronized (lock) {
                    while (number % 2 == 0) { // wait if not odd
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (number <= MAX) {
                        System.out.println("Odd: " + number);
                        number++;
                        lock.notify();
                    }   
                }
            }
        }
    }

    // Thread to print even numbers
    class EvenThread implements Runnable {
        public void run() {
            while (number <= MAX) {
                synchronized (lock) {
                    while (number % 2 != 0) { // wait if not even
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (number <= MAX) {
                        System.out.println("Even: " + number);
                        number++;
                        lock.notify();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();

        Thread t1 = new Thread(printer.new OddThread());
        Thread t2 = new Thread(printer.new EvenThread());

        t1.start();
        t2.start();
    }
    
}
