package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class C10814 {

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        ArrayList<Member> memberList = new ArrayList<>();
//
//        for  (int i = 0; i < N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//
//            int a = Integer.parseInt(st.nextToken());
//            String b =st.nextToken();
//
//            memberList.add(new Member(a,b,i));
//        }
//
//        memberList.sort(new Comparator<Member>() {
//            @Override
//            public int compare(Member o1, Member o2) {
//                if (o1.age != o2.age) {
//                    return Integer.compare(o1.age, o2.age);
//                } else {
//                    return Integer.compare(o1.joinOrder, o2.joinOrder);
//                }
//            }
//        });
//
//        for (Member member : memberList) {
//            sb.append(member.age).append(" ").append(member.name).append("\n");
//        }
//        System.out.println(sb);
//    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        ArrayList<Member> members = new ArrayList<>();

        for (int i = 0; i< N; i ++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members.add(new Member(age, name, i));
        }

        members.sort(new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age != o2.age){
                    return Integer.compare(o1.age, o2.age);
                }else {
                    return Integer.compare(o1.joinOrder, o2.joinOrder);
                }
            }
        });

        for (Member member : members){
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        System.out.println(sb);

    }







}
class Member {
    int age;
    String name;
    int joinOrder;

    public Member (int age, String name, int joinOrder) {
        this.age = age;
        this.name = name;
        this.joinOrder = joinOrder;
    }
}
