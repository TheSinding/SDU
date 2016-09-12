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
package initials;



/**
 *
 * @author thesinding
 */
public class Initials {
    public static void main(String[] args) {
        String[] text = new String[9];
        text[0] = "0111110000111110";    
        text[1] = "1100011001100011";
        text[2] = "1000001001000001";
        text[3] = "1100000001100000";
        text[4] = "0110000000110000";
        text[5] = "0011110000011110";
        text[6] = "1000011001000011";
        text[7] = "1100011001100011";
        text[8] = "0111110000111110";

        for(int y = 0; y < 9; y++){
            for(int x = 0; x < text[y].length(); x++){
                int temp = Character.getNumericValue(text[y].charAt(x));
                if(temp == 1){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.print('\n');
        }
    }
    
}
