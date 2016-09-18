/*
 * The MIT License
 *
 * Copyright 2016 - Simon Sinding.
 * http://www.SimonSinding.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package counterextra;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thesinding
 */
public class CounterExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 50;
        for(int i = 0; i < value;){
            if((value % 2) == 0){
                System.out.print(value + " is an even number");
            } else {
                System.out.print(value + " is an uneven number" );
            }
            if((value % 3) == 0){
                System.out.print(" and it's also dividable with 3");
            } 
            System.out.print("\n\n");
            value--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(CounterExtra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(value <= 0){
            System.out.println("-----------------------------------------");
            System.out.println("And that was a little counting exercise..");
            System.out.println("\n");
        }
    }
    
}
