package 기초.timeComplexity;

import java.util.Scanner;

public class C24262 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int sum = 0;

        int[][] a = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = 1;
            }
        }
        for (int i = 0; i < 5-1; i++) {
            for (int j = i+1; j < 5; j++) {
                a[i][j] = 0;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}
