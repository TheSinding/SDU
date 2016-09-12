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

package eggcounter2.pkg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EggCounter25 {

    public static void main(String[] args) {

        BufferedReader br = null;
        int egg, leftOver, dozen, gross, leftOverGross;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                
                System.out.print("How many eggs do we have (type q for quit): ");
                String input = br.readLine();
                if ("q".equals(input)) {
                    System.out.println("Thank you, come again!");
                    System.exit(0);
                }
                if(isItInt(input)){ 
                    egg = Integer.parseInt(input);    
                    gross = egg / 144;
                    leftOverGross = egg % 144;
                    dozen = leftOverGross / 12;
                    leftOver = leftOverGross % 12;
                    System.out.print("That equals to: ");
                    if(gross >= 1){
                        System.out.print(gross + " Gross, ");
                    }
                    if(dozen >= 1){
                        System.out.print(dozen + " dozen ");
                    }
                    if(dozen >= 1 && leftOver > 0){
                        System.out.print("and " + leftOver  + " leftover ");
                    }
                    if(egg == 0){
                        System.out.print("I cant calculate with 0 eggs you DUMMY! TRY AGAIN!");
                    } else if(egg > 0 && egg < 12){
                        System.out.print("You could have counted that yourself idiot, its ");
                        if(egg == 1){
                            System.out.print(egg + " egg");
                        } else {
                            System.out.print(egg + " eggs");
                        }
                        System.out.print(", now go learn how to count!");
                    } else if(egg >= 12){
                        if(leftOver == 1){
                            System.out.print("egg ");
                        } else {
                            System.out.print("eggs ");
                        }
                    }
                } else {
                    System.out.print("What am I supposed to do with " + input + " !");
                }
                
                
                System.out.print("\n");
                System.out.println("-----------\n");
            } 

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static boolean isItInt(String input){
        try{
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}