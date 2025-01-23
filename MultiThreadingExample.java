class MyTask extends Thread {
    private String name;

    MyTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " is running, iteration " + i);
        }
    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        MyTask t1 = new MyTask("Thread 1");
        MyTask t2 = new MyTask("Thread 2");

        t1.start();
        t2.start();
    }
}
