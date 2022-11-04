import java.util.*;
public class splitIntoParts {
    public static String splitInParts(String s, int partLength) {
        // your code
        int counter = 0;
        String returnStr = "";
        for(char element : s.toCharArray()){
            if(counter % partLength == 0 && counter != 0){
                returnStr += " " + element;
                counter = 0;
            } else{
                returnStr += element;
            }
            counter++;
        }
        return returnStr;
    }
    public static void main(String[] args) {
        
    }
}
