package 기초;

import javax.swing.text.html.StyleSheet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C11659 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int[] S = new int[N + 1];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            S[i] = S[i-1] + Integer.parseInt(st2.nextToken());
        }




        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());


            int result = S[end] - S[start-1];

            sb.append(result).append("\n");
        }



        System.out.println(sb.toString());




    }
}
