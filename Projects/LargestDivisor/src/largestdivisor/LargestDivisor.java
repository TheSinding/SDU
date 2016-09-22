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
package largestdivisor;

/**
 *
 * @author thesinding
 */
public class LargestDivisor {
    
    
    public static void main(String[] args) {
        int high, sameY, count; // Creating the high counter, and Y counter for the array
                                // the divided number
        int same[][];  //creating the array to Store the numbers of corresponding divsors
                       // And creating the array for storing numbers with divisors        
        same = new int[100][20]; // Give it 100 spots in x, 10 in y.
        
        boolean higher = false; // Higher is used as a flag when a higher
                                // divisor number then the old is reached
        
        high = 0;   // Set high number to 0
        sameY = 0;  // Set Y number to 0
        count = 0;
        for(int i = 1; i < 10000; i++){ // Starts at 1, becuase cant divide with 0.
            for(int x = 1; x <= i; x++){
                if(i % x == 0){
                    count++; // If it has a divisor, add 1 to the array
                }
            }
            if(count > high){ // Check if there is more divisors than previous number
                high = count; // Store the number
                higher = true; // Set higher flag to true.
            }
            if(count == high && high > 0|| higher){ // Check if the nunmber of divisors is the same, or there was a higher number
                if(higher){
                    sameY = 0;      // if it was higher, set y to 0
                    higher = false; // set higher to false
                }
                same[high][sameY] = i; // store the number
                sameY++; // Add to Y
            }
            count = 0;
        }
        for(int i = 0; i < same.length; i++){   // Now count the stored numbers
            if(same[i][0] > 0){                 // if the first entry is higher the 0.
                System.out.printf("The numbers "); // print 
                for(int x = 0; x < same[i].length; x++){ 
                    if(same[i][x] > 0){ // if the number is higher than 0
                    // This is only to make sure it doesnt print 0's
                        System.out.printf("%s, ", same[i][x]);
                    }
                }
                System.out.printf("all has %s divisors", i); // Print i
                System.out.println();
                
           } 
           
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("This was a Ren Remoulade Productions \nK, thxxx byyyyyyye.. ");
    }
    
}
