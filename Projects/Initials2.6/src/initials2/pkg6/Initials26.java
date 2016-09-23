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
package initials2.pkg6;

import java.util.Scanner;


/**
 *
 * @author thesinding
 */
public class Initials26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  decision, input; // Decision and input placeholders
        String[] name = new String[2]; // Make a name array holder
        Scanner sc = new Scanner(System.in); // Create scanner input
        
        int decider = (int)(Math.random() * 100); // Random decider
        boolean good = false; // used for making a decision
        
        if(decider > 70){ // Decides if its a good name
            good = true; 
            decision = "FUCKING AWESOME NAME"; // decision text
        } else {
            decision = "You mom and pa, didn't really like ya', huh?"; // decision text
        }
        
        
        System.out.println("Enter you name, and I'll tell you if it's a good name:"); // Text
        System.out.print("> "); // Text
        input = sc.nextLine(); // reads the name into input
        
        name = input.split(" "); // Splits input by the space into two parts
        
        // Just a WAAAAAY too long printf statement
        System.out.printf("Hello, %s %s\n"
                + "%s is %s chars long\n"
                + "%s is %s chars long\n"
                + "Your initials is %s%s\n\n"
                + "The verdict?: %s\n\n", name[0], name[1], name[0], name[0].length(), name[1], name[1].length(), name[0].charAt(0), name[1].charAt(0), decision);
        
    }
    
}
