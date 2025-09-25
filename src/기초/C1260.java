package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C1260 {


    static int[][] list;
    static boolean[] visited;
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        list = new int[N+1][N+1];
        visited = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            list[a][b] = 1;
            list[b][a] = 1;
        }

        dfs(V);
        Arrays.fill(visited, false);
        sb.append("\n");
        bfs(V);

        System.out.println(sb);
    }

    public static void dfs ( int V){
        visited[V] = true;
        sb.append(V).append(" ");
            for (int i = 1; i <= N; i++) {
                if(list[V][i] == 1 && !visited[i]){
                    dfs(i);
                }
            }
    }
    public static void bfs(int V){
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        visited[V] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            sb.append(temp).append(" ");

            for (int i = 1; i <= N; i++) {
                if (list[temp][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
