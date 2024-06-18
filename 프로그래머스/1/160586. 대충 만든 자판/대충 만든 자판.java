import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 문자의 최소 입력 횟수를 저장하는 Map
        Map<Character, Integer> minPresses = new HashMap<>();
        
        // keymap을 순회하여 각 문자의 최소 입력 횟수를 기록
        for (int i = 0; i < keymap.length; i++) {
            String keys = keymap[i];
            for (int j = 0; j < keys.length(); j++) {
                char c = keys.charAt(j);
                // 현재 문자의 입력 횟수를 기록 (기존 값보다 작으면 갱신)
                minPresses.put(c, Math.min(minPresses.getOrDefault(c, Integer.MAX_VALUE), j + 1));
            }
        }

        // 결과를 저장할 배열
        int[] result = new int[targets.length];
        
        // 각 타겟 문자열에 대해 최소 입력 횟수를 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPresses = 0;
            boolean canType = true;
            
            for (char c : target.toCharArray()) {
                if (minPresses.containsKey(c)) {
                    totalPresses += minPresses.get(c);
                } else {
                    // 문자를 작성할 수 없는 경우
                    canType = false;
                    break;
                }
            }
            
            if (canType) {
                result[i] = totalPresses;
            } else {
                result[i] = -1;
            }
        }
        
        return result;
    }
}