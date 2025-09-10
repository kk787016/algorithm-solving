package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C10816 {

    public static void main(String[] args) throws IOException {

        // 시간 제한 1초 인데
        // 2천만 까지 가능함.
        // 2중 for문 사용할 수 없음.

        // 중복도 포함해야 하니까 map 으로 만들고
        // 키랑 쌍으로 ?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
        {
            int key = Integer.parseInt(st.nextToken());
            // 값을 입력받아 정수로 변환
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++)
        {
            int findNum = Integer.parseInt(st2.nextToken());

            sb.append(map.getOrDefault(findNum, 0)).append(" ");

        }
        System.out.println(sb);
    }
}
