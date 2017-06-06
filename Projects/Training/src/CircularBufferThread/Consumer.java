package CircularBufferThread;

/**
 * Created by thesinding on 6/6/17.
 */
public class Consumer implements Runnable {
    CircularBuffer c;
    int initVal;

    public Consumer(CircularBuffer c, int initVal){
        this.c = c;
        new Thread(this, "Consumer_"+initVal).start();
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Value : " + c.get());
            try{
                Thread.sleep((long) (Math.random() * 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
