import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        //배열 arraylist로 변환
        ArrayList<Integer> intList = new ArrayList<>();
        
        intList.add(arr[0]);
        for(int i=0 ; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                intList.add(arr[i+1]);
            }
        }        
        
        int[] answer = new int[intList.size()];
        for(int i=0; i < intList.size(); i++){
            answer[i] = intList.get(i);
        }
        


        return answer;
    }
}