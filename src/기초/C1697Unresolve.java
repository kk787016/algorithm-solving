package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class C1697Unresolve {

    static int N;
    static int M;
    static int[] visited;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new int[500010];

        Arrays.fill(visited, 0);


        bfs();



    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = 1;
        if (N == M) {
            System.out.println("0");
            return ;
        }

        while(!queue.isEmpty()){
            int cur = queue.poll();
            int[] nextPositions = {cur - 1, cur + 1, cur * 2};
            for (int nextPos : nextPositions) {
                if (nextPos == M) {
                    System.out.println(visited[cur]);
                    return;
                }

                if (nextPos >=0 && nextPos<= 200001 && visited[nextPos] ==0) {
                    visited[nextPos] = visited[cur]+1;
                    queue.offer(nextPos);
                }
            }





        }

    }
}
