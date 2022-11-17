import java.math.BigInteger;
import java.util.*;
public class hugeBook {
    public static long pageDigits(long pages) {
       
        // one page at a time
        // digits = 0
        // for i in 1 to 4000000000:
        //   digits += # of digits in i
        // print digits
        //
        // 1 to 9: all contain 1 digit. we know there are 9 of them.
        // digits += 1 * 9
        //
        // 10 to 99: all contain 2 digits, we know there are 90 of them
        // digits += 2 * 90
        //
        // 100 to 999: digits += 3 * 900
        //
        // stops at 583.
        // 100 to 583: 3 * 584
        // 1 2 3 number of digits is 3
        // book that has 10 pages 1, 2, 3, 4, 5, 6, 7, 8, 9, 10: number of digits is 11
        // 87495 : 1 .. 9, 10..99, 100..999, 1000..9999, 10000..87495 
        //           9       2*90   3*900      4*9000       numDigits * (pages - 10^(numDigits-1) + 1)
        // count = 0
        // number = 87495 : 5 digits 
        // number = 1: numDigits = 1
        // 
        // int numDigits is num digits in input number
        // count = 0
        // for (int i = 1; i <= numDigits-1; i++) {
        //       add i * 9 * 10^(i-1) to count
        // how many numbers are there from 10000 to 87495
        //                                    A      B
        // take pages - 10^(numDigits-1) + 1
        // length of string is above multiplied by numDigits
        // 
        // add numDigits * (number - 10^(numDigits - 1) + 1)
        // }
        // [8,   7 ,   4,    9,    5,     6,      7         8]
        // [9   90    900   9000   90000  900000  9000000  90000000
        // 8 digits. 9,999,999 < n <= 99,999,999

        // long, double, float, int, char
        long count = 0L;
        long numDigits = String.valueOf(pages).length();
        // BigInteger ten = new BigInteger("10")
        for(int i = 1; i <= numDigits - 1; i++){
            long powInt = (long) Math.pow(10l, i - 1) ;
            // if(pages == powInt) {
            //     long nine = i * 9;
            //     count += powInt * nine;
            // } else{
            //     count += i * (pages - powInt);
            //     break;
            // }
            // System.out.println(i);
            // System.out.println(powInt);
            count += i * 9 * powInt;
            
            
        }
        count += numDigits * (pages - (long) Math.pow(10,numDigits - 1) + 1);


        
        return count;
    }
    public static void main(String[] args) {
       System.out.println(pageDigits(100));
    }
}
