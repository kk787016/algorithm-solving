package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C2606 {
    static boolean[] visited;
    static int[][] graph;
    static int N;
    static int count;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];


        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        count =0;

        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int V) {
        visited[V] = true;

        for (int i = 1; i <= N; i++) {
            if (graph[V][i] == 1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }

    }
}
