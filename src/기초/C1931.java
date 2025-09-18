package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C1931 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] array = new int[N][2];


        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            array[i][0] = start;
            array[i][1] = end;
        }

        Arrays.sort(array, (o1, o2) -> {
            if (o1[1]== o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });


        int time = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {

            if (array[i][0] >= time)
            {
                time = array[i][1];
                count ++;
            }
        }
        System.out.println(count);
    }
}
