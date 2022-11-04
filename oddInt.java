import java.util.*;
public class oddInt {
    // xor: 101011 
    // N:   111000
    // xor: 010011
    // xor ^ N ^ N = xor
    // 1 3 1 
    // 0 ^ 1 ^ 3 ^ 1 = ?
    // 0 ^ (1 ^ 1) ^ 3 = ?
    // 0 ^ 0 ^ 3 = 3     

    // xor ^= N
    //     
    public static int findIt(int[] a) {
        int occurance = 0;
        int curNum = 0;
        // List<Integer> b = Arrays.stream(a)
        //     .boxed()
        //     .sorted()
        //     .collect(Collectors.toList());
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            // loop state: occurance , curNum, element, i
            // 
            
            if (i == 0) {
                occurance = 1;
                curNum = a[i];
                continue;
            }
            if(curNum != a[i]){
                
                if(occurance % 2 == 1){
                    return curNum;
                }
                occurance = 1;
                curNum = a[i];
            } else{
                occurance++;
            }
        }
        return curNum;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 5, 5, 5, 5, 7, 7, 7};
        System.out.println(findIt(arr));
    }
}
