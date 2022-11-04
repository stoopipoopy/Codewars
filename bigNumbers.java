public class bigNumbers {
    public static String add(String a, String b) {
         // i messed up somewhere in my calculation and i need these
        String startingA = a;
        String startingB = b;
        

        // check if a and b are empty
        if(a.equals("") || b.equals("")){
          System.out.println("0");
          return "";
        }

        /*
         * split strings a and b into substrings
         * change a & b to be the first 14 letters
         * betterA & betterB are the remaining letters
         */
        String betterA = "0";
        if(a.length() > 20){
          betterA = a.substring(a.length() - 15, a.length());
          System.out.println("Reached A");
          a = a.substring(0,a.length() - 15);
          System.out.println(a + betterA);
        } 
        String betterB = "0";
        if(b.length() > 20){
          betterB = b.substring(b.length() - 15, b.length());
          System.out.println("Reached B");
          b = b.substring(0, b.length() - 15);
          System.out.println(b + betterB);
        } 

        // initialize variables
        Long segment1A = new Long(a);
        Long segment1B = new Long(b);
        
        Long segment2A = new Long(betterA);
        Long segment2B = new Long(betterB);

        // check if the above calculation failed somehow
        String stringA = segment1A.toString() + segment2A.toString();
        String stringB = segment1B.toString() + (segment2B.toString().equals("0") ? "" : segment2B.toString());
        if(stringA.equals(startingA)){
          System.out.println("A parsed correctly");
        }
        if(stringB.equals(startingB)){
          System.out.println("B parsed correctly");
        }
        
        System.out.println("segment1A: " + segment1A + " segment1B: " + segment1B + " segment2A: " + segment2A + " segment2B: " + segment2B);

        /*
         * segment 1 is the first segments added together
         * 1234 + 5678
         * segment1:
         * 12 + 56
         * 
         * segment2 is the second segments added together
         * 1234 + 5678
         * segment2:
         * 34 + 78
         * 
         * these segments account for positional notation when adding strings
         */
        Long segment1 = new Long(
           segment1B + segment1A
                                       
                    );
        
        
        
        Long segment2 = new Long(
          segment2B + segment2A
        );
        
        
        System.out.println("seg1: " + segment1);
        System.out.println("seg2: " + segment2);
        System.out.println("A: " + startingA);
        System.out.println("B: " + startingB);
        
        System.out.println("|"+((segment1 + segment2))+"|");

        /*
         * check for overlap in the second segment and compensate
         * example:
         * 1234 + 7890
         * segment2:
         * 34 + 90
         * 124 <- the hundreds place should carry over to first segment
         * but we are adding strings so we get
         * 90124 and not 9124
         */
        if(segment2.toString().length() > segment2A.toString().length()){
          segment1 += 1;
          segment2 = new Long(segment2.toString().substring(1));
        }

        /*
         * check if segment 2 is 0
         * if it is, just return segment 1
         * example:
         * segment1 = 12
         * segment2 = 0
         * with check:
         * returns only segment1 (12)
         * without check:
         * returns segment1 + segment2 (120)
         */
        if(segment2.toString().equals("0")){
          return segment1.toString();
        }
        // if segment 2 is not 0, return both segments combined
        else{
          return (segment1.toString() + segment2.toString());
        }
        
      }
      public static void main(String[] args) {
        System.out.println(add("1", "1"));
        System.out.println("\n");
        // should return 2
        // returns 2

        System.out.println(add("63829983432984289347293874", "90938498237058927340892374089"));
        System.out.println("\n");
        // should return 91002328220491911630239667963
        // returns 91002328220491911630239667963

        System.out.println(add("77728761843143033072264230","7586753647"));
        System.out.println("\n");
        // should return 77728761843143040659017877
        // returns 85315515490143033072264230
      }
}