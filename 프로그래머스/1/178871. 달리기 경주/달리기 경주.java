import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 각 플레이어의 인덱스를 저장하는 HashMap
        Map<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }

        for (String calling : callings) {
            int currentIndex = playerIndexMap.get(calling);
            if (currentIndex > 0) { // 인덱스가 0보다 큰 경우에만 교환
                int previousIndex = currentIndex - 1;

                // players 배열에서 위치 교환
                String temp = players[previousIndex];
                players[previousIndex] = players[currentIndex];
                players[currentIndex] = temp;

                // HashMap에서 인덱스 업데이트
                playerIndexMap.put(players[previousIndex], previousIndex);
                playerIndexMap.put(players[currentIndex], currentIndex);
            }
        }

        return players;
    }
}