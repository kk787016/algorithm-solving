package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C2630Unresolve {

    static int[][] array;
    static int blue = 0;
    static int white = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        array = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        func(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }


    public static void func(int x, int y, int l) {
        boolean w = true;
        boolean b = true;

        for (int i = x; i < x+l; i++) {
            for (int j = y; j < y+l; j++) {
                if (array[i][j] == 1) {
                    w = false;
                }else{
                    b = false;
                }
            }
        }

        if (w) {
            white +=1;
            return;
        }
        if (b) {
            blue +=1;
            return;
        }


        func(x, y, l / 2);
        func(x, y + l / 2, l / 2);
        func(x + l / 2, y, l / 2);
        func(x + l / 2, y + l / 2, l / 2);
    }


}
