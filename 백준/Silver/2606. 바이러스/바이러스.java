import java.util.*;
import java.io.*;

class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void dfs(int idx) {
        visited[idx] = true;
        answer++;
        for (int i = 1; i <= N; i++)
            if (visited[i] == false && graph[idx][i])
                dfs(i);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        int x, y;
        for (int i = 0; i < M; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            x = Integer.parseInt(str.nextToken());
            y = Integer.parseInt(str.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        dfs(1);

        System.out.println(answer - 1);
    }
}