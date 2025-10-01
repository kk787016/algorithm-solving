package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C2252 {

    static int[] inDegree;


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        //일부 학생만 비교해봤어.
        int N = Integer.parseInt(st.nextToken());  // 학생 수
        int M = Integer.parseInt(st.nextToken());  // 간선 수

        inDegree = new int[N+1];

        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) { // 1 2
            st = new StringTokenizer(br.readLine());
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());

           graph.get(p1).add(p2);
            inDegree[p2]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            sb.append(cur).append(" ");

            for (int i : graph.get(cur)) {
                inDegree[i]--;
                if (inDegree[i] == 0) {
                    queue.add(i);
                }
            }


        }
        System.out.println(sb.toString());
    }

}
