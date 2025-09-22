package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C1654 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] array = new int[K];

        long max = 0;

        for (int i =0 ; i<K; i++){
            array[i] = Integer.parseInt(br.readLine());
            if (max< array[i])
            {
                max = array[i];
            }
        }


        max ++;
        long min = 0;
        long mid = 0;


        while (min < max){

            long count = 0;

            mid = (max+min)/ 2;
            for (long i : array){
                count += i /mid;
            }
            // 갯수를 세어 봤는데
            //
            if(count < N) {
                max = mid;
            }
            else {
                min = mid + 1;
            }



        }

        System.out.println(min-1);
    }


}
