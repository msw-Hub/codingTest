class Solution {
    public int[] solution(String[] park, String[] routes) {
    // 출발지 S를 우선 찾음
    int[] start = new int[2];
    boolean found = false;
    for (int i = 0; i < park.length; i++) {
        for (int j = 0; j < park[i].length(); j++) {
            if (park[i].charAt(j) == 'S') {
                start[0] = i;
                start[1] = j;
                found = true;
                break;
            }
        }
        if (found) break;
    }

    // 이동방향을 정함 ("E 2" -> 동쪽으로 2칸)
    for (String route : routes) {
        int dir = direction(route);
        switch (route.charAt(0)) {
            case 'E': // 동쪽
                if (start[1] + dir < park[0].length()) {
                    boolean blocked = false;
                    for (int i = 1; i <= dir; i++) {
                        if (park[start[0]].charAt(start[1] + i) == 'X') {
                            blocked = true;
                            break;
                        }
                    }
                    if (!blocked) start[1] += dir;
                }
                break;
            case 'W': // 서쪽
                if (start[1] - dir >= 0) {
                    boolean blocked = false;
                    for (int i = 1; i <= dir; i++) {
                        if (park[start[0]].charAt(start[1] - i) == 'X') {
                            blocked = true;
                            break;
                        }
                    }
                    if (!blocked) start[1] -= dir;
                }
                break;
            case 'S': // 남쪽
                if (start[0] + dir < park.length) {
                    boolean blocked = false;
                    for (int i = 1; i <= dir; i++) {
                        if (park[start[0] + i].charAt(start[1]) == 'X') {
                            blocked = true;
                            break;
                        }
                    }
                    if (!blocked) start[0] += dir;
                }
                break;
            case 'N': // 북쪽
                if (start[0] - dir >= 0) {
                    boolean blocked = false;
                    for (int i = 1; i <= dir; i++) {
                        if (park[start[0] - i].charAt(start[1]) == 'X') {
                            blocked = true;
                            break;
                        }
                    }
                    if (!blocked) start[0] -= dir;
                }
                break;
        }
    }
    return start;
}

public int direction(String route) {
    String[] split = route.split(" ");
    return Integer.parseInt(split[1]);
}
}