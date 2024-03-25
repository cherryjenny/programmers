class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        for(String str: seoul){
            if(str.contains("Kim")){
                answer = Integer.toString(i);
                break;
            }
            i++;
        }
        return "김서방은 "+ answer + "에 있다";
    }
}