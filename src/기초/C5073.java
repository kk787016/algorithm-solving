package 기초;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C5073 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        boolean isCheck = true;
        while (isCheck){
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                String result = "1 ";
                if (a == 0 && b == 0 && c == 0) {
                    break;
                }

                int large = 0;

                large = Math.max(a, b);
                large = Math.max(large, c);

                int shor = Math.min(a, b);
                shor = Math.min(shor, c);

                int mid = 0;
                if (a == large) {
                    mid = Math.max(b, c);
                    if (a >= b + c) {
                        result = "Invalid";
                        System.out.println(result);
                        continue;
                    }
                } else if (b == large) {
                    mid = Math.max(a, c);
                    if (b >= a + c) {
                        result = "Invalid";
                        System.out.println(result);
                        continue;
                    }
                } else if (c == large){
                    mid = Math.max(a, b);
                    if (c >= a + b) {
                        result = "Invalid";
                        System.out.println(result);
                        continue;
                    }
                }

                // 삼각형인지
                if (large == shor && shor == mid){
                    result = "Equilateral";
                }else if (large == mid){
                    result = "Isosceles";
                }else if (mid == shor){
                    result = "Isosceles";
                }
                else {
                    result = "Scalene";
                }
                System.out.println(result);
            }





        }
    }
}
