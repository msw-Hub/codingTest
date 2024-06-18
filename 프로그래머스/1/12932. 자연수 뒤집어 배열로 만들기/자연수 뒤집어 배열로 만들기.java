class Solution {
    public int[] solution(long n) {
        //1. 각 자리 숫자를 한자리 숫자로 쪼개서 배열로 저장
        String num = Long.toString(n);
        int[] nums = new int [num.length()];
        int i=0;
        for(char c : num.toCharArray()){
            nums[i] = c -'0';
            i++;
        }
        //2. 저장한 숫자를 역순으로 정렬
        int[] result = new int [num.length()];
        for(int k=0; k< nums.length;k++){
            result[k] = nums[nums.length-k-1];
        }
        return result;
    }
}