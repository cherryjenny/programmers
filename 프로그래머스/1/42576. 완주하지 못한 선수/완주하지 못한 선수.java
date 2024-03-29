import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 1. Hash map을 만든다.
        HashMap<String, Integer> map = new HashMap<>();
        for(String player: participant){
            map.put(player, map.getOrDefault(player,0) + 1);
        }
        // 2. Hash map을 뺀다.
        for(String player: completion)
            map.put(player,map.get(player) - 1);
        // 3. Value가 0이 아닌 마지막 주자를 찾는다.
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}