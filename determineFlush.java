public class determineFlush{

    public static boolean CheckIfFlush(String[] cards){
       
        for(int i = 0; i < cards.length; i++){
            cards[i] = cards[i].substring(cards[i].length() - 1);
            
        }
        String flush = cards[0];
        for(int i = 1; i < cards.length; i++){
            if(!(cards[i].equals(flush))){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String[] input = new String[]{"5G", "9G", "AG", "JG", "10G"};
        System.out.println(CheckIfFlush(input));
    }
}