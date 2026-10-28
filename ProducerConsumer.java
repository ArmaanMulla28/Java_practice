import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
public class ProducerConsumer {
    static final int BUFFER_SIZE = 5;
    static Queue<Integer> buffer = new LinkedList<>();
    static Semaphore empty = new Semaphore(BUFFER_SIZE);
    static Semaphore full = new Semaphore(0);
    static Semaphore mutex = new Semaphore(1);
    static class Producer extends Thread {
        public void run() {
            try {
                while (true) {
                    int item = ThreadLocalRandom.current().nextInt(1, 101);
                    empty.acquire();
                    mutex.acquire();

                    buffer.add(item);
                    System.out.println("[Producer] Produced: " + item+ " | Buffer: " + buffer);
                    mutex.release();
                    full.release();

                    Thread.sleep(700);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    static class Consumer extends Thread {
        public void run() {
            try {
                while (true) {
                    full.acquire();
                    mutex.acquire();

                    int item = buffer.remove();
                    System.out.println("[Consumer] Consumed: " + item+ " | Buffer: " + buffer);
                    mutex.release();
                    empty.release();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void main(String[] args) 
    throws InterruptedException {
        System.out.println("Starting Producer-Consumer simulation..."); 
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.setDaemon(true);
        consumer.setDaemon(true);
        producer.start();
        consumer.start();
        Thread.sleep(5000);
        System.out.println("\nProgram finished.");
    }
}