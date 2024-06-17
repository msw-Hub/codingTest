public class Solution {
    boolean solution(String s) {
        boolean answer;
        int pCount = 0;
        //문자열 하나씩 검사
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P') {
                pCount++;
            }else if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
                pCount--;
            }
        }
        if(pCount==0) answer = true;
        else answer = false;

        return answer;
    }
}