package 기초;

import java.util.Scanner;

public class C2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        int count = 0;

        int minBags = Integer.MAX_VALUE;
        boolean found = false;

        for (int b = 0; b <= N / 5; b++) {
            for (int a = 0; a <= N / 3; a++) {
                if (3 * a + 5 * b == N) {
                    int currentBags = a + b;
                    if (currentBags < minBags) {
                        minBags = currentBags;
                        found = true;
                    }
                }
            }
        }

        if (found) {
            System.out.println(minBags);
        } else {
            System.out.println(-1);
        }
    }
}

