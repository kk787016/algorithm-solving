package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class C1012 {

    static int resultCount;
    static  int[][] graph;
    static boolean[][] visited;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int N;
    static int M;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> result =  new ArrayList<>();

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st2.nextToken()); // 가로
            N = Integer.parseInt(st2.nextToken()); // 세로
            int K =  Integer.parseInt(st2.nextToken());
            graph = new int[N+1][M+1];
            visited = new boolean[N+1][M+1];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[y+1][x+1] = 1;
            }


            resultCount = 0;
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= M; k++) {
                    if (graph[j][k] == 1 && !visited[j][k]){
                        resultCount ++;
                        dfs(graph, j, k);

                    }
                }
            }
            result.add(resultCount);

        }
        for (int i : result) {
            System.out.print(i + " ");
        }


    }
    public static void dfs(int[][] graph, int y, int x) {

        visited[y][x] = true;
        //M 가로

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];



            if (ny<0 || ny>N || nx<0 || nx>M ) {
                continue;
            }
            if (graph[ny][nx] == 0 || visited[ny][nx]) {
                continue;
            }

            dfs(graph, ny, nx);

        }


    }
}
