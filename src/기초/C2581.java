package 기초;


import java.util.Scanner;

public class C2581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M =  sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = -1;

        for (int i = M; i <= N; i++) {
            boolean check = false;
            if (i == 1) {
                continue; // 1은 소수가 아니므로 다음 숫자로 넘어감
            }
            for( int j = 2; j<i; j++)
            {
                if (i%j == 0)
                {
                    check = true;
                    break;
                }
            }
            if (!check){
                sum = sum + i;

                if (min == -1) { // 아직 최솟값이 설정되지 않았다면 (즉, 첫 소수라면)
                    min = i;    // 현재 소수를 최솟값으로 설정
                }


            }

        }

        if (sum == 0)
        {
            sum = -1;
            System.out.println(sum);

        }else
        {
            System.out.println(sum);
            System.out.println(min);
        }



        // 소수 조건은?
        // 1과 자기 자신 뿐.
        // 2부터 자기 자신까지 나눴을 때 한 번도 안나눠지면?
        //

    }
}
