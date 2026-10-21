
class MyThread extends Thread {
    int id;

    MyThread(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Thread " + id + " is running");
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);

        t1.start();
        t2.start();
        t3.start();
    }
}
