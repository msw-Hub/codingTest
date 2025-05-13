import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");

        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        solution(M, N);

    }

    public static void solution(int M, int N) { //M은 행, N은 열
        int[][] arr;
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 우, 하, 좌, 상
        arr = new int[M][N];

        int x = 0, y = 0;
        int d = 0; // 방향 인덱스
        int count = 0;

        arr[x][y] = 1; // 시작점

        while (true) {
            boolean moved = false;

            int prevD = d;  // 이전 방향 저장

            for (int i = 0; i < 4; i++) {
                int nx = x + dir[d][0];
                int ny = y + dir[d][1];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && arr[nx][ny] == 0) {
                    if (prevD != d) count++;  // 방향이 바뀐 경우에만 count 증가
                    x = nx;
                    y = ny;
                    arr[x][y] = 1;
                    moved = true;
                    break;
                }

                d = (d + 1) % 4;  // 다음 방향
            }

            if (!moved) break; // 네 방향 모두 막힌 경우 종료
        }

        System.out.println(count);
    }
}
