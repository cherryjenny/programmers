import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    
        //input값 읽어서 int로 변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
    
        // dp 배열 초기화
        int[] dp = new int[num+1];
        
        
        for(int i =0; i < dp.length; i++){
            if(i==0) dp[i] = 0;      //0은 0
            else if(i==1) dp[i] = 1; //1은 1
            else dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[num]);
    }
}