package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C2178 {


    static int[][] graph;
    static int[][] visited;
    static int[] dx = {-1, 0, 1,0};
    static int[] dy = {0, 1, 0,-1};
    static int N ;
    static int M;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N+1][M+1];
        visited = new int[N+1][M+1];

        for (int i = 0; i < N+1; i++) {
            Arrays.fill(visited[i], 0);
        }


        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= M; j++) {
                graph[i][j] = line.charAt(j-1) - '0';
            }
        }

        int result = bfs(graph);

        System.out.println(result);

    }

    public static int bfs(int[][] graph) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {1, 1});
        visited[1][1] = 1;

        while (!queue.isEmpty()) {
            int[] arr =  queue.poll();
            int y = arr[0];
            int x = arr[1];
            if( y == N && x == M)
            {
                return visited[y][x];
            }
            for (int i = 0; i < 4; i++) {

                int nextY = y + dy[i];
                int nextX = x + dx[i];


                if (nextX < 0 || nextX > M || nextY < 0 || nextY > N) {
                    continue;
                }
                if (graph[nextY][nextX]== 1 &&  visited[nextY][nextX] == 0) {
                    visited[nextY][nextX] = visited[y][x]+1;
                    queue.offer(new int[] {nextY, nextX});
                }



            }
        }
        return 0;
    }
}
