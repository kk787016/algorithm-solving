package 기초;

import java.util.Scanner;

public class C2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[9][9];

        int max = 0;
        int y = 1, x = 1;
        for  (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                nums[i][j] = sc.nextInt();
                if (nums[i][j] > max)
                {
                    max = nums[i][j];
                    y = i+1;
                    x = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(y+ " "+ x);
    }
}
