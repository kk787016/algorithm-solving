package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class C1010 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int result  = 0;
            // 다리가 겹치지 않도록 하는 경우의 수를 구하여라
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            BigInteger result1 = new BigInteger("1");
            BigInteger result2 = new BigInteger("1");
            BigInteger result3 = new BigInteger("1");

            for (int j = 1; j<=M; j++)
            {
                result1 =result1.multiply(new BigInteger(String.valueOf(j)));
            }

            for (int k = 1; k<=M-N; k++)
            {
                result2 = result2.multiply(new BigInteger(String.valueOf(k)));
            }
            for (int e = 1; e<=N ; e++)
            {
               result3= result3.multiply(new BigInteger(String.valueOf(e)));
            }

            result1 = result1.divide(result2);
            result1 = result1.divide(result3);

            System.out.println(result1);


            //  mCn
            //  ( M! / (M-n)!) * 1/   N!

        }

    }
}
