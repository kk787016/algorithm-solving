package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C11660 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();


        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int N =  Integer.parseInt(st2.nextToken());
        int M =  Integer.parseInt(st2.nextToken());

        int[][] S = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            st2 = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {

                S[i][j] = Integer.parseInt(st2.nextToken()) + S[i-1][j] + S[i][j-1] - S[i-1][j-1];

            }
        }


        for (int i = 1; i <= M; i++) {
            st2 = new StringTokenizer(br.readLine());
            int x1 =  Integer.parseInt(st2.nextToken());
            int y1 =  Integer.parseInt(st2.nextToken());

            int x2 =  Integer.parseInt(st2.nextToken());
            int y2 =  Integer.parseInt(st2.nextToken());

            //(3,4) - (2,2)

            int result = S[x2][y2]- S[x2][y1-1] -S[x1-1][y2] + S[x1-1][y1-1];

            sb.append(result).append("\n");
        }

        System.out.println(sb.toString());

    }
}
