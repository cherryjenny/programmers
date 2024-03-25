import java.util.*;

class Solution {
    boolean solution(String s) {
        
        ArrayList<String> strArr = new ArrayList<>();
        
        for(String str : s.split("")){
            strArr.add(str);
        }
        
        int num = 0;
        for(int i=0; i<strArr.size(); i++){
            if(strArr.get(i).equals("(")){
                num += 1;
            }else{
                num -= 1;
            }
            if(num < 0){
                return false;
            }
        }
        
        return (num == 0) ? true : false;
    }
}