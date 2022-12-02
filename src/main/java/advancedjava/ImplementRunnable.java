package advancedjava;

public class ImplementRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Implement Runnable : " + Thread.currentThread().getName());

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println("- Implement Runnable End -");
    }
}
