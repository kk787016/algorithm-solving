package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C2805Unresolve {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 나무 수
        int M = Integer.parseInt(st.nextToken()); // 가져갈 나무 높이
        int[] array = new int[N];

        st = new StringTokenizer(br.readLine());

        long max = 0;

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if (array[i]> max){
                max = array[i];
            }
        }
        long result = 0;
        long start = 1;

        while (start < max)
        {
            long mid = (start+max)/2; // 중간값 확인.

            long count= 0;
            for (int i: array){
                if (i > mid){
                    count += i - mid;
                }
            }

            if (count >= M){
                start = mid + 1; //
                result = mid;
            }else {
                max = mid ;
            }
        }

        System.out.println(result);
    }
}
