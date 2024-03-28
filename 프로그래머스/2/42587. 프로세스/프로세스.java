import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        //넣고 빼기 쉽도록 arraylist로 바꿔주기
        List<Integer> intArr = new ArrayList<Integer>();
        for(int i : priorities){
            intArr.add(i);
        }
        
        //location이 현재 max이면서, 맨 앞으로 왔을 때 반복문 탈출
        while(location >= 0){
            
            //현재 max 찾기
            int max = Collections.max(intArr);
            
            //맨 앞이 max보다 작으면, 빼서 맨 뒤로 붙이기
            if(intArr.get(0) < max){
                System.out.println("for문 시작:" + location);
                int temp = intArr.get(0);
                intArr.remove(0);
                location--;     //location은 한칸 전진
                intArr.add(temp);
                
                //만약 알고싶은 원소가 맨 앞으로 오게 되었는데 max가 아니면 location을 맨 뒤로 옮겨줌 
                if(location<0){
                    location = intArr.size()-1;
                }
            //맨 앞이 max라면, 빼고 location 전진
            }else{
                intArr.remove(0);
                location--;
                answer++; //등수 한칸 밀리기
                
                //만약 알고싶은 원소개 맨 앞이라면, 반복문 탈출
                if(location<0){
                    break;
                }
            }
        }
            
        return answer;
    }
}