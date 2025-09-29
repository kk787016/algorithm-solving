package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C7576 {

    static int N;
    static int M;
    static int[][] graph;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] visited;

    static ArrayList<int[]> arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        //  N 세로 ,  M 가로

        graph = new int[N + 1][M + 1];
        visited = new int[N + 1][M + 1];


        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 1) {
                    arrayList.add(new int[]{i, j});
                    visited[i][j] = 1;
                }
                if (graph[i][j] == -1) {
                    visited[i][j] = -1;
                }
            }
        }
        bfs();

        int result = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (visited[i][j] > result) {
                    result = visited[i][j];
                }
                if (visited[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        result--;
        System.out.println(result);

    }
    //bfs 돌리고
    // 0 이 남아 있으면 -1 출력
    // 아니면 맥스 저장하고 출력하면 끝.


    public static void bfs() {

        Queue<int[]> queue = new LinkedList<>();

        for (int[] i : arrayList) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int y = arr[0];
            int x = arr[1];

            for (int i = 0; i < 4; i++) {
                int nextY = arr[0] + dy[i];
                int nextX = arr[1] + dx[i];


                if (nextX <= 0 || nextX > M || nextY <= 0 || nextY > N) {
                    continue;
                }
                if (graph[nextY][nextX] == -1) {
                    visited[nextY][nextX] = -1;
                    continue;
                }

                if (graph[nextY][nextX] == 0 && visited[nextY][nextX] == 0) {
                    visited[nextY][nextX] = visited[y][x] + 1;
                    queue.offer(new int[]{nextY, nextX});
                }


            }


        }
    }
}
