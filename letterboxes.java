import java.util.*;
public class letterboxes {
    public static int[] paintLetterboxes(final int start, final int end) {
        // Your code here
        ArrayList<Integer> boxes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            boxes.add(i);
        }
        int[] payout = new int[] {0,0,0,0,0,0,0,0,0,0};
        for(int box : boxes){
            for(String element : Integer.toString(box).split("")){
                payout[Integer.parseInt(element)]++;
            }
        }
        return payout;
      }
      public static void main(String[] args) {
        for(int element : paintLetterboxes(1, 2)){
            System.out.println(element);
        }
      }
    
}
