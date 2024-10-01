import java.util.*;
class Solution {  //   상,하,좌,우
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        
        int[][] visited = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        
        //queue에 정점 추가
        q.add(new int[]{0,0});
        visited[0][0] = 1;
        
        while(!q.isEmpty()){
            int[] current = q.poll();
            int X = current[0];
            int Y = current[1];
            
            
            //현재 자리에서 상하좌우 확인
            for(int i=0; i < 4; i++){
                int nX = X + dx[i];
                int nY = Y + dy[i];
            
                
                if(nX < 0 || nX >= n || nY < 0 || nY >= m)
                    continue;
                
                
                //visited에 움직인 거리 수 저장하기
                if(visited[nX][nY] == 0 && maps[nX][nY] == 1){
                    visited[nX][nY] = visited[X][Y] + 1;
                    q.add(new int[]{nX, nY});
                }
                
                if(nX == n-1 && nY == m-1 && visited[n-1][m-1] > 0){
                    q.clear();
                    break;
                }
                    
                
            }
        }
        
        
        return visited[n-1][m-1] > 0 ? visited[n -1][m -1] : -1;
    }
}