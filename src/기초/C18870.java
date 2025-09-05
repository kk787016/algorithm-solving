package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C18870 {
    static ArrayList<Integer>arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Integer[] result = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < N; i++) {
            set.add(result[i]);
        }
        arr = new ArrayList<Integer>(set);

        Collections.sort(arr);

        for  (int i = 0; i < N; i++) {
            sb.append(find(result[i])).append(" ");
        }
        System.out.println(sb);

    }

    static int find (int x)
    {
        int result =0;
        int start = 0;
        int end = arr.size();

        while(start <= end)
        {
            int mid = (start + end )/2;

            if (arr.get(mid)<x)
            {
                start = mid +1;
            }
            else if (arr.get(mid)>x)
            {
                end = mid -1;
            }
            else {
                result = mid;
                break;
            }
        }
        return result;


    }
}
