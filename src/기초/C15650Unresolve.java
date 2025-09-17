package 기초;

import java.util.Arrays;
import java.util.Scanner;

public class C15650Unresolve {

    public static int[] arr;
    public static boolean[] visited;

    public static int N;
    public static int M;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N];
        arr = new int[N];


        //중복 없는 오름차순

        backtracking(1,0);


    }

    public static void backtracking(int start, int depth){

        if (depth == M)
        {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i]+" ");

            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {

                arr[depth] = i;
                backtracking(i+1, depth+1);
            }

        }


        // 1234
        // 4321
        // 2341 전부 1234라서 . 중복 제거를 해야 하는데.
        // 애초에 백트래킹으로 안들어가야됨.

        //중복 제거가 아니라
        //애초에 들어가지 않도록.






}