import java.util.*;
public class stopSpiningMyWords{
    public static String spinWords(String sentence) {
        String finalStr = "";
        for(String element : sentence.split(" ", -1)){
            char[] arr = element.toCharArray();
            if(element.length() >= 5){
                for(int i = element.length() - 1; i >= 0; i--){
                    finalStr += arr[i];
                }
            }
            else{
                finalStr += element;
            }
            finalStr += " ";
        }
        // 0123456
        // abcdef
        // ^    $
        return finalStr.substring(0, finalStr.length() - 1);
      }
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors") + "|");
    }
}