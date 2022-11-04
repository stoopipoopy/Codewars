import javax.swing.plaf.synth.SynthOptionPaneUI;

public class bookPages{
    public static int amountOfPages(int summary) {
        int count = 0;
        int returnVal = 0;
        
        for(int i = 1; i <= summary; i++){
            
            count += Integer.toString(i).length();
            
            if(count == summary){
                returnVal = i;
                break;
            }
        }
        return returnVal;
    }
    public static void main(String[] args) {
        System.out.println(amountOfPages(2));
    }
}