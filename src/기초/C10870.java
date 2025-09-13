package 기초;

import java.util.Scanner;

public class C10870 {

    static int result =0;
    static int count = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        pivo(N,0,1);
        System.out.println(result);
    }

    public static void pivo(int n,int start, int end){
        if (n == 0 ){
            result = 0;
            return;
        }
        count ++;
        if (n == count){
            result = end;
            return ;
        } // 종료 조건은 N만큼 반복했을 때

        pivo(n, end, start +end);


    }


}
