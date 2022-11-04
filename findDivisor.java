public class findDivisor{
    public long numberOfDivisors(int n) {
        long sum = 0;
        for (int i=1 ;i <= n; i++){
            if (n % i == 0){
                sum++;
            }
        }

        return sum;
      }
}