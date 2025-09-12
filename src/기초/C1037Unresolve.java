package 기초;

import java.util.Arrays;
import java.util.Scanner;

public class C1037Unresolve {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        // 약수들을 오름차순으로 정렬합니다.
        Arrays.sort(nums);

        // 가장 작은 진짜 약수와 가장 큰 진짜 약수를 곱합니다.
        int result = nums[0] * nums[N - 1];

        System.out.println(result);

        sc.close();


    }
}
