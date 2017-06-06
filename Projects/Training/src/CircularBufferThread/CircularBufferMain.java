package CircularBufferThread;
import interfaces.StartProgramInterface;
/**
 * Created by thesinding on 6/5/17.
 */

public class CircularBufferMain implements StartProgramInterface {
   @Override
    public void startProgram() {
        CircularBuffer c = new CircularBuffer(1000);
        new Producer(c, 0);
        new Producer(c, 2);
        new Producer(c, 5);
        new Consumer(c, 1);
        new Consumer(c, 4);
    }
}
