class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i=1; i<arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    
    //최소공배수 구하기
    private int lcm(int a, int b){
        //최소공배수는 두 수의 곱을 최대공약수로 나눈것과 같다
        return (a * b) / gcd(a , b);
    }
    
    //최대 공약수 구하기
    private int gcd(int a, int b){
        
        //b가 더 크면 자리 바꿔주기
        if(b > a){
            int temp = a;
            a = b;
            b = temp;
        }
        
        int r=0;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    
}