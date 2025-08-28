package 기초;

import java.util.Arrays;
import java.util.Scanner;

public class C25206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] str = new String [100][100];
        double[] record = new double [20];
        double[] grade = new double [20];

        for (int i = 0; i<20; i++)
        {
            String input = sc.nextLine();
            str[i] = input.split(" ");

            record[i] = Double.parseDouble(str[i][1]);

            if (str[i][2].equals("A+"))
            {
                grade[i] = 4.5;
            } else if (str[i][2].equals("A0")) {
                grade[i] = 4.0;
            } else if (str[i][2].equals("B+")) {
                grade[i] = 3.5;
            }else if (str[i][2].equals("B0")) {
                grade[i] = 3.0;
            } else if (str[i][2].equals("C+")) {
                grade[i] = 2.5;
            } else if (str[i][2].equals("C0")) {
                grade[i] = 2.0;
            } else if (str[i][2].equals("D+")) {
                grade[i] = 1.5;
            } else if (str[i][2].equals("D0")) {
                grade[i] = 1.0;
            }else if  (str[i][2].equals("F")) {
                grade[i] = 0.0;
            }else {
                grade[i] = -1;
                record[i] = -1;
            }


        }

        double a = 0.0;
        for (int i = 0; i < 20; i++) {
            if (record[i] <0)
            {
                continue;
            }
            else {
                a += record[i];
            }
        }

        double b = 0.0;

        for (int i = 0; i <20; i++) {
            if (grade[i] <0)
            {
                continue;
            }
            else {
                b += grade[i] * record[i];
            }

        }

        double result = b/a;

        System.out.println(Math.round(result*1000000)/1000000.0);

    }

}
