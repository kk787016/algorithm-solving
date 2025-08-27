package 기초;

import java.util.Arrays;
import java.util.Scanner;

public class C10811 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] nums = new int[n];
        int[] change = new int[m*2];

        for (int i = 0; i < n; i++) {
            nums[i] = i+1;
        }
        for (int i =0; i<m*2; i+=2) {
            change[i] = scanner.nextInt();
            change[i+1] = scanner.nextInt();
            int start = i;
            int end = i+2;
        }



        for (int i =0; i<m*2; i+=2) {

            int a = change[i]-1;
            int b = change[i+1]-1;

            int c = ((b-a)/2)+1;
            if (a<b){
                for (int j =0; j<c; j++) {
                    int temp = nums[a];
                    nums[a] = nums[b];
                    nums[b] = temp;
                    a++;
                    b--;
                }
            }


        }
       for (int num : nums) {
           System.out.println(num);
       }
    }

}


//12345
//21345
//21435
//34125