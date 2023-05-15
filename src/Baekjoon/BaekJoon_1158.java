package Baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon_1158 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int target = scanner.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++){
            linkedList.add(i+1);
        }

        StringBuffer sb = new StringBuffer("<");

        int idx = 0;
        while (!linkedList.isEmpty()) {
            idx = (idx + (target - 1)) % linkedList.size();
            sb.append(linkedList.remove(idx) + ", ");
        }
        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.println(sb);
    }
}