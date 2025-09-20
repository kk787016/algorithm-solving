package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C11047 {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N  = Integer.parseInt(st.nextToken());
        int M  = Integer.parseInt(st.nextToken());

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }


        int result = 0;


        for (int i = N-1; i >= 0; i--)  {
            // 6  1000
            if (nums[i] <= M) {
                result = result +  M/nums[i];
                M = M % nums[i];


            }
        }


        System.out.println(result);

    }
}
