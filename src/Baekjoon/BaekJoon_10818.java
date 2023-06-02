package Baekjoon;

import java.util.*;

public class BaekJoon_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int min = 0;
        int max = 0;

        int[] number = new int[size];

        for (int i = 0; i < number.length; i++){
            number[i] = scanner.nextInt();
            for (int j = 0; j < i; j++){
                min = Math.min(number[i], min);
                max = Math.max(number[i], max);
            }
        }
        System.out.println(min+" "+max);
    }
}
