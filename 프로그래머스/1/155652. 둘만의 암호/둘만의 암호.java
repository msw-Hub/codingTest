import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        // skip 문자열의 각 문자를 숫자로 변환하여 Set에 저장
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        // 결과를 저장할 StringBuilder
        StringBuilder answer = new StringBuilder();

        // s 문자열의 각 문자를 변환
        for (char c : s.toCharArray()) {
            int count = 0;
            while (count < index) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }
                if (!skipSet.contains(c)) {
                    count++;
                }
            }
            answer.append(c);
        }

        return answer.toString();
    }
}