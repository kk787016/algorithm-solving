package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class C10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {

            int num = Integer.parseInt(br.readLine());

            if (num == 0){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(num);
            }
        }
        int sum = 0;
        for ( int num : stack){
         sum = sum+ num;
        }
        System.out.println(sum);
        br.close();

    }
}
