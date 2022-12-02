package advancedjava;

public class ExtendThread extends Thread{

    @Override
    public void run() {
        System.out.println("Extend Thread : " + getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println("- Extend Thread End -");
    }
}
