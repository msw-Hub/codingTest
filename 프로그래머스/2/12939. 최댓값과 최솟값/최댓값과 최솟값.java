class Solution {
    public String solution(String s) {
        // 문자열을 공백으로 분리
        String[] numberStrings = s.split(" ");
        int[] num = new int[numberStrings.length];
        //문자열을 숫자로 변환
        for(int i=0; i<numberStrings.length;i++){
            num[i] = Integer.parseInt(numberStrings[i]);
        }
        //최대 최소값 넣기
        int max = num[0];
        int min = num[0];
        for(int j=1; j<numberStrings.length; j++){
            if(num[j]>=max) max = num[j];
            if(num[j]<=min) min = num[j];
        }
        return min+" "+max;
    }
}