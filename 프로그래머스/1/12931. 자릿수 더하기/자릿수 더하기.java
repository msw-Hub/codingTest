import java.util.*;

public class Solution {
    public int solution(int n) {
        String num = Integer.toString(n);
        int sum=0;
        for(char c: num.toCharArray()){
            sum = sum + (int)c - '0';
        }
        return sum;
    }
}