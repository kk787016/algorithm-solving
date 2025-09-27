package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C2667 {

    static int N;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;
    static int currentHouseCount;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1][N + 1];
        count  = 0;
        for (int i = 1; i <= N; i++) {
            String[] str = br.readLine().split("");

            for (int j = 1; j <= N; j++) {
                graph[i][j] = Integer.parseInt(str[j - 1]);
            }

        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <=N; i++) {
            for (int j = 1; j <= N; j++) {

                if (graph[i][j] == 1 && !visited[i][j]) {
                    count++;
                    currentHouseCount = 0;
                    //a.add(bfs(graph,i,j));
                    dfs(graph, i, j);
                    a.add(currentHouseCount);
                }
            }
        }
        Collections.sort(a);

        System.out.println(count);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void dfs(int[][] graph, int y, int x) {

        currentHouseCount++;
        visited[y][x] = true;
        //여기서 dfs 돌리면 될듯?

        for (int i = 0; i < 4; i++) {
            if (y+dy[i] < 0 || y+dy[i] > N || x+dx[i] < 0 || x+dx[i] > N) {
                continue;
            }
            if (graph[y+dy[i]][x+dx[i]] == 1 && !visited[y+dy[i]][x+dx[i]]) {

                dfs(graph, y+dy[i], x+dx[i]);
            }


        }

    }
    public static int bfs(int[][] arr, int cdy, int cdx) {

        Queue<int[]> queue = new LinkedList<>();
        int houstCount = 1;
        queue.offer(new int[]{cdy, cdx});

        visited[cdy][cdx] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int ny = cur[0] + dy[i];
                int nx = cur[1] + dx[i];

                if (ny < 1 || ny > N || nx < 1 || nx > N) {
                    continue;
                }
                if (visited[ny][nx] || arr[ny][nx] == 0) {
                    continue;
                }

                houstCount ++;
                queue.offer(new int[]{ny, nx});
                visited[ny][nx] = true;

            }


        }

        return houstCount;




    }
}
