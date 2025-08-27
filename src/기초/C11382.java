package 기초;

import java.util.Scanner;

public class C11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long[] nums = new Long[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextLong();
        }
        Long sum = 0L;
        for (int i = 0; i < 3; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
