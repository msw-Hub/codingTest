class Solution {
    public int[] solution(String[] wallpaper) {
    int luy = Integer.MAX_VALUE;
    int rdy = Integer.MIN_VALUE;
    int lux = Integer.MAX_VALUE;
    int rdx = Integer.MIN_VALUE;

    for (int i = 0; i < wallpaper.length; i++) {
        for (int j = 0; j < wallpaper[i].length(); j++) {
            if (wallpaper[i].charAt(j) == '#') {
                if (i < lux) lux = i; // 최소 행
                if (i + 1 > rdx) rdx = i + 1; // 최대 행 + 1
                if (j < luy) luy = j; // 최소 열
                if (j + 1 > rdy) rdy = j + 1; // 최대 열 + 1
            }
        }
    }

    return new int[]{lux, luy, rdx, rdy};
}

}