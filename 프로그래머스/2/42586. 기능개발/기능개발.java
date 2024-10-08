import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i < progresses.length; i++){
            // 1. 한개 기능을 개발하는데 필요한 날짜 계산
            double days = (100 - progresses[i]) / (double) speeds[i];
            int daysUp = (int) Math.ceil(days);
            
            // 2. 함께 배포할 기능의 index 찾기
            int j = i + 1;
            for(;j < progresses.length; j++){
                if(progresses[j] + daysUp * speeds[j] < 100){
                  break;  
                }
            }
            // 3. 이번에 배포할 기능의 개수를 추가하기
            answer.add(j-i);
            i = j - 1;
        }
        int[] answerArray = new int[answer.size()];
        for(int i=0; i < answer.size(); i++)
            answerArray[i] = answer.get(i);

        return answerArray;
        
        }
        
    }
