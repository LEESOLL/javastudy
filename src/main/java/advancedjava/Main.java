package advancedjava;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread implementRunnable = new Thread(new ImplementRunnable());
        implementRunnable.start();

        ExtendThread extendThread = new ExtendThread();
        extendThread.start();
    }
}
