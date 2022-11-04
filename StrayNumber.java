public class StrayNumber {
    static int stray(int[] numbers) {
        int firstNum = 0;
        int secondNum = 0;
        int firstOccurance = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                firstNum = numbers[i];
            }
            if (numbers[i] != firstNum) {
                secondNum = numbers[i];
            } else {
                firstOccurance++;
            }
        }
        if (firstOccurance == 1) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 1, 1, 1, 1, 1 };

        System.out.println(stray(arr));

    }
}
