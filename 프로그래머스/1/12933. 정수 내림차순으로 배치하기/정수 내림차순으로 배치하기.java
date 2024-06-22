import java.util.*;
class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환하여 각 자리 숫자를 추출
        String str = Long.toString(n);
        int length = str.length();
        
        // 각 자리 숫자를 저장할 배열
        long[] num = new long[length];
        
        // 각 자리 숫자를 배열에 저장
        for (int i = 0; i < length; i++) {
            num[i] = str.charAt(i) - '0';
        }

        // 배열을 정렬하여 내림차순으로 변환
        Arrays.sort(num);
        for (int i = 0; i < length / 2; i++) {
            long temp = num[i];
            num[i] = num[length - 1 - i];
            num[length - 1 - i] = temp;
        }

        // 내림차순으로 정렬된 숫자를 다시 하나의 숫자로 변환
        long result = 0;
        for (int i = 0; i < length; i++) {
            result = result * 10 + num[i];
        }

        return result;
    }
}