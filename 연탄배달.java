import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //마을 수 읽어오기
        int n = Integer.parseInt(br.readLine());

        //마을 위치 읽어오기
        String[] inputArr = br.readLine().split(" ");

        //String배열을 int배열로 전환
        int[] distanceList = new int[n];
        for(int i = 0; i < n ; i++){
            distanceList[i] = Integer.parseInt(inputArr[i]);
        }

        //가까운 마을 개수 -> 출력할 값
        int count = 0;
        
        //min값 초기화
        int min = distanceList[1]-distanceList[0];
        
        int cal = 0;
        for(int i=0; i<n; i++){
            for(int j=n; j-i-1>0; j--){
                cal = distanceList[j-1]-distanceList[i];
                //더 짧은 마을 거리가 나오면 count 초기화, min값 바꿔주기
                if(min > cal){
                    count = 1;
                    min = cal;
                // 같은 거리 나오면 count++
                }else if(min == cal){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}