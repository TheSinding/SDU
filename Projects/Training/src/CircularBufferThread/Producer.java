package CircularBufferThread;

/**
 * Created by thesinding on 6/6/17.
 */
public class Producer implements Runnable{
    private CircularBuffer p;
    private int initVal;

    public Producer(CircularBuffer c, int initVal){
        this.p = c;
        this.initVal = initVal * 100;
        new Thread(this, "Producer_"+initVal).start();
    }

    @Override
    public void run() {
        int i = initVal;
        while(true){
            p.put(i++);
            try{
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
