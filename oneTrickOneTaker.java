import java.util.*;
public class oneTrickOneTaker {
    public static String winnerOfTrick(String[] cards, String[] players) {
        // ...gHappy gCoding !
        String suit = cards[0].substring(1);
        int index = 0;
        int highestIndex = 0;
        int highestVal = Integer.MIN_VALUE; 
        String conversion = "0123456789TJQKA";
        for(String card : cards){
            System.out.println(card);
            if(card.substring(1).equals(suit)){
                System.out.println(card.substring(1));
                if(conversion.indexOf(card.substring(0, 1)) > highestVal){
                    highestVal = conversion.indexOf(card.substring(0, 1));
                    highestIndex = index;
                }
            }
            index++;
        }
        return players[highestIndex] + " wins";
    }
    public static void main(String[] args) {
        System.out.println(winnerOfTrick(new String[]{"3H","KH","8C","AH"}, new String[]{"a","b","c","d"}));
    }
}
