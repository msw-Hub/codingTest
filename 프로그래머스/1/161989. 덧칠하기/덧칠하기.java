class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int i = 0;

        if((n/m) == section.length) return n;

        while (i < section.length) {
            count++;
            int nextPosition = section[i] + m;
            while (i < section.length && section[i] < nextPosition) {
                i++;
            }
        }
        return count;
    }
}