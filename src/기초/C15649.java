package 기초;

import java.util.Formattable;
import java.util.Map;
import java.util.Scanner;

public class C15649 {

    public static int[] arr;
    public static boolean[] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        visited = new boolean[N];
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        backtracking(0, N, M);


    }

    public static void backtracking(int depth, int N, int M) {
        //dfs란 깊이 우선 탐색.

        // 깊이까지 쭉 들여다보고(visited를 이용해서.) 하나씩 출력하는 것.
        // 여기서는 내가 출력한 숫자인지 확인하는 것.
        if (depth == M ){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i-1]){
                visited[i-1] = true;
                arr[depth] = i;
                backtracking(depth+1, N, M);
                visited[i-1] = false;
            }
        }



    }

}
