package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class C2206Unresolve {

    static int N;
    static int M;
    static int[][] graph;
    static int[][][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][M + 1];
        visited = new int[N + 1][M + 1][2];

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            for (int j = 1; j <= M; j++) {
                graph[i][j] = s.charAt(j - 1) - '0';
            }
        }

        System.out.println(bfs());

    }

    public static int bfs() {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{1,1,0});

        visited[1][1][0] = 1;

        if (N == 0 && M == 0) {
            return 1;
        }

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int y = arr[0];
            int x = arr[1];
            int crash = arr[2];

            if (y == N && x == M) {
                return visited[y][x][crash];
            }

            for (int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];

                if (nextY > N || nextX > M || nextY <= 0 || nextX <= 0) {
                    continue;
                }
                if (graph[nextY][nextX] == 0 && visited[nextY][nextX][crash] == 0) {
                    visited[nextY][nextX][crash] = visited[y][x][crash] +1;
                    queue.offer(new int[]{nextY, nextX, crash});
                } else if (graph[nextY][nextX] == 1 && crash == 0) {
                    if (visited[nextY][nextX][1] == 0) {
                        visited[nextY][nextX][1] = visited[y][x][crash] + 1;
                        queue.offer(new int[]{nextY, nextX, 1});
                    }

                }

            }

        }

        return -1;
    }



}
