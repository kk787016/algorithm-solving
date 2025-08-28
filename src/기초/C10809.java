package 기초;

import java.util.Arrays;
import java.util.Scanner;

public class C10809 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("");

        int[] arr = new int[26];
        int[] result = new int[26];

        Arrays.fill(result, -1);

        int sata = "a".codePointAt(0);

        for  (int i = 0; i < 26; i++) {
            arr[i] = sata+i;
        }

        for (int i = 0; i < strs.length; i++) {
            for  (int j = 0; j < 26; j++) {
                if (strs[i].codePointAt(0) == arr[j]) {
                    if (result[j] == -1 ){
                        result[j] = i;
                        break;
                    }

                }
            }

        }
        for (int i = 0; i < 26; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
