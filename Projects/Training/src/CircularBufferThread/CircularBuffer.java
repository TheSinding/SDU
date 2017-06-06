package CircularBufferThread;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by thesinding on 6/6/17.
 */
public class CircularBuffer {
    private int[] arr;
    private int size;
    int putIndex = 0;
    int getIndex = 0;

    public CircularBuffer(int size){
        this.size = size;
        this.arr = new int[size];

    }


    public int get(){
        if(getIndex > this.arr.length - 1){
            getIndex = 0;
        }
        if(this.arr[getIndex] != 0){
            System.out.println("Place : " + getIndex);
            getIndex++;
            // Had to do -1 because it's incremented above
            return this.arr[getIndex - 1];
        }
        return -1;
    }

    public void put(int ob){
        if(putIndex > this.arr.length - 1){
            putIndex = 0;
        }
        this.arr[putIndex] = ob;
        putIndex++;
    }

    public String toString(){
        return "Buff: "+ Arrays.toString(arr);
    }
}
