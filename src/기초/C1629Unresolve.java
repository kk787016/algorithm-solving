package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C1629Unresolve {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        br.close();

        long tt =    fun(a, b, c);

        System.out.println(tt);
    }

    public static long fun(int a, int b, int c){

        if (b == 1 ){
            return a%c;
        }

        long temp = fun(a, b / 2, c);

        if (b % 2 == 0){
            return (temp * temp)% c;
        }else {
            return (((temp * temp) % c)* a)% c;
        }



    }
}
