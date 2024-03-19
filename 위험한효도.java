import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException{
        //각 입력값 문자배열로 읽어서 int로 할당
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        int d = Integer.parseInt(strArr[2]);

        //값 초기화
        int result = 0;
        int quotient = 0;
        int remainder = 0;

        //가는 길
        if(d%a==0){
            quotient = d/a;
            result = a*quotient + b*(quotient-1);
        }else{
            quotient = d/a;
            remainder = d%a;
            result = a*quotient + b*quotient + remainder;           
        }

        //돌아오는 길
        if(d%b==0){
            quotient = d/b;
            result += b*quotient + a*(quotient-1);
        }else{
            quotient = d/b;
            remainder = d%b;
            result += b*quotient + a*quotient + remainder;           
        }      

        System.out.println(result);
        
        
    }
}