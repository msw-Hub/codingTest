class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int count1 = 0;
        int count2 = 0;
        String answer = "Yes";

        for (int i = 0; i < goal.length; i++) {
            String card = goal[i];
            if (count1 < cards1.length && card.equals(cards1[count1])) {
                count1++;
            } else if (count2 < cards2.length && card.equals(cards2[count2])) {
                count2++;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}