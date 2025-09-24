package 기초;

import java.util.PriorityQueue;
import java.util.Scanner;

public class C1927 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();


        for (int i = 0; i < N; i++) {

            int next = sc.nextInt();

            if (next != 0) {
                queue.add(next);
            }
            else {
                if (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
                else {
                    System.out.println(0);
                }

            }


            // 0이면 최소값 가져와서 출력하고 제거
            // 0 이 아니면 입력


        }

        // 자연수 x 를 넣는다.
        // 배열에서 가장 작은 값을 출력하고, 그 값을 제거한다.
        //
    }
}
