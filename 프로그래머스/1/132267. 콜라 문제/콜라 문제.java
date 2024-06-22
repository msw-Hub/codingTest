class Solution {
    public int solution(int a, int b, int n) {
        int namuji = n%a;
        int newBottle = (n/a)*b;
        int sumBottle = newBottle;
        int nowBottle = namuji+newBottle;
        while(nowBottle>=a){
            namuji = nowBottle%a;
            newBottle = (nowBottle/a)*b;
            sumBottle += newBottle;
            nowBottle = namuji+newBottle;
        }
        //1. 처음 들고 있는 병의 수n을 a로 나누고 나머지를 저장, 몫을 b와 곱해서 새로 받은 병수를 저장, 이 둘을 더한게 현재 들고 있는 병수
        //2. 처음 병수에 새로 받은 병수를 지속적으로 더한것이 결과값 (언제까지? 현재 들고있는 병수<a 가 될때까지)
        return sumBottle;
    }
}