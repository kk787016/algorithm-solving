package 기초;

import java.util.Scanner;

public class C24416 {

    public static int result_g = 0;
    public static int result_d = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();


        fib(n);
        fib2(n);

        System.out.println(result_d+ " "+ result_g);
    }
    public static int fib(int n){

        if (n == 2 || n == 1){
            result_d++;
            return 1;
        }
        else {

            return fib(n-1)+ fib(n-2);
        }
    }

    public static void fib2(int n ){

        int[] nums = new int[n+1];
        nums[0]= 1;
        nums[1] = 1;
        for (int i = 2; i < n; i++) {
            nums[i] = nums[i-1] + nums[i-2];
            result_g++;
        }

    }
}
