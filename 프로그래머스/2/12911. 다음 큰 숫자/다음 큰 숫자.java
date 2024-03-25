class Solution {
    public int solution(int n) {
        
        //1의 갯수 세기
        int BitN = toBinary(n);

        
        while(true){
            int nextN = toBinary(++n);
            if(BitN == nextN){
                break;
            }
        }
        
        return n;
    }
    
    private static int toBinary(int n){
        int count = 1;
        
        //2진수로 변환했을 때 1 개수
        while(n > 1){
            if(n%2 == 1){
                count++;
            }
            n /= 2;
        }
        //1을 나눈 값도 포함
        return count;
    }
}