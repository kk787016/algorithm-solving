package 기초;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C11729 {

    static int count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        hanoi(N,1,2,3);
        // N개가 입력되면.
        //

        System.out.println(count);
        System.out.println(sb);
    }
    public static void hanoi (int N, int start, int mid, int end){
        count ++;

        if (N == 1){
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }
        hanoi(N - 1, start, end, mid);
        sb.append(start).append(" ").append(end).append("\n");

        hanoi(N - 1, mid, start, end);
    }

    // {1 , 2 ,3 }
}
