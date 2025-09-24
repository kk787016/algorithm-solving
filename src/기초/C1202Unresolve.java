package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C1202Unresolve {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Jewelry> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st2.nextToken());
            int price = Integer.parseInt(st2.nextToken());

            Jewelry jew = new Jewelry(weight, price);
            list.add(jew);

        }

        int[] bag = new int[K];

        for (int i = 0; i < K; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bag);
        Collections.sort(list);
        long result = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0, j = 0; i < K; i++) {

            int checkBag = bag[i];
            while(true){

                if (j>=N) {
                    break;
                }
                Jewelry jew = list.get(j);

                if (bag[i]< jew.weight)
                {
                    break;
                }
                q.add(jew.price);
                j++;
            }
            if(!q.isEmpty()) {
                result += Math.abs(q.poll());
            }



        }
        System.out.println(result);




    }
    public static class Jewelry implements Comparable<Jewelry> {
        int weight;
        int price;

        public Jewelry(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(Jewelry o) {
           return this.weight - o.weight;
        }
    }
}
