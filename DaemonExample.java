class MyDaemonThread extends Thread {
    public void run() {
        if (isDaemon()) {
            System.out.println("Daemon thread is running.");
        } else {
            System.out.println("User thread is running.");
        }
    }
}

public class DaemonExample {
    public static void main(String[] args) {
        MyDaemonThread t1 = new MyDaemonThread();
        MyDaemonThread t2 = new MyDaemonThread();

        t1.setDaemon(true); // Set t1 as a daemon thread

        t1.start();
        t2.start();
    }
}
