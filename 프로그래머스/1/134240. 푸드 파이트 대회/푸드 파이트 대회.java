class Solution {
    public String solution(int[] food) {
        int[] myFood = new int [food.length];
        StringBuilder result = new StringBuilder();
        //음식을 반 나눠서 몫만 넣기
        for(int i =1; i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                result.append(i);
            }
        }
        //내가 먹을 음식을 1~n까지 넣고0넣고 n~1까지 다시넣기
        String another = result.toString();  // 현재 결과를 문자열로 변환
        String reversed = result.reverse().toString();  // 결과를 뒤집은 문자열
        
        return another + "0" + reversed;  // 완성된 문자열 반환
    }
}