class Solution {
     public int solution(int number, int limit, int power) {
        int[] divisors = new int[number + 1];
        int result = 0;

        // 약수의 개수를 계산합니다.
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisors[j]++;
            }
        }

        // 약수의 개수에 따라 피로도를 계산합니다.
        for (int i = 1; i <= number; i++) {
            if (divisors[i] > limit) {
                result += power;
            } else {
                result += divisors[i];
            }
        }

        return result;
    }
}