class Solution {
    public int solution(int n){
        return divisors(n);
    }
    public int divisors(int n){
        int sum=0;
        for(int i=1; i<=n;i++){
            if(n%i == 0) sum=sum+i;
        }
        return sum;
    }
}