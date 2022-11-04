import java.util.*;
import java.math.*;
public class tenThousandthPrime {
    public static void main(String[] args) {
        int counter = 0;
        int primeCounter = 0;
        while(true){
            if(counter == 0 || counter == 1){
                counter++;
                continue;
            }
            BigInteger curNum = new BigInteger(Integer.toString(counter));
            if(curNum.isProbablePrime(95) && primeCounter == 10000 /* prime to find, -1 */){
                System.out.println(curNum.toString());
                break;
            } else if(curNum.isProbablePrime(95)){
                primeCounter++;
            }
            counter++;
        }
    }
}
