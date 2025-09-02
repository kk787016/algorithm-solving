package 기초;

import java.util.Scanner;

public class C2869Unresolve {
    public static void main(String[] args) {

        int tree_size = 0;
        int morning_up = 0;
        int evening_down = 0;

        int day = 0;
        Scanner sc = new Scanner(System.in);

        morning_up = sc.nextInt();
        evening_down = sc.nextInt();
        tree_size = sc.nextInt();


        int result = (tree_size-evening_down)/(morning_up-evening_down);

        int result2 = (tree_size-evening_down)%(morning_up-evening_down);

        if (result2 >0) {
            result ++;
        }

        System.out.println(result);


    }
}
