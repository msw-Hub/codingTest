public class Solution {
    public int solution(int number, int limit, int power) {
        int[] num = new int[number + 1];
        int result = 0;

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    sum++;
                    if (j != i / j) {
                        sum++;
                    }
                }
            }
            if (sum > limit) {
                num[i] = power;
            } else {
                num[i] = sum;
            }
            result += num[i];
        }
        return result;
    }
}