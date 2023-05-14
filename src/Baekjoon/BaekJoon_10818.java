package Baekjoon;

import java.util.*;

public class BaekJoon_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] number = new int[size];

        for (int i = 0; i < number.length; i++){
            number[i] = scanner.nextInt();
        }

        Arrays.sort(number);
        System.out.println(number[0] + " " + number[size - 1]);
    }
}
