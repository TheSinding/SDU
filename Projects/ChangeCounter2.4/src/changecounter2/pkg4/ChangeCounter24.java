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
package changecounter2.pkg4;

import java.util.Scanner;

/**
 *
 * @author thesinding
 */
public class ChangeCounter24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pennies, 
            nickels, 
            dimes, 
            dollars;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many pennies are we talking?: ");
        pennies = sc.nextInt();
        System.out.print("Now whats the situration with the nickels?: ");
        nickels = sc.nextInt();
        System.out.print("Come on give me the dimes: ");
        dimes = sc.nextInt();
        
        pennies = pennies % 20;
        
        
        System.out.printf("Pennies = %s", pennies);

        
    }
    
}
