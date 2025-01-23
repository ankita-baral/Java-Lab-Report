class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running.");
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start(); // Start the thread
    }
}
