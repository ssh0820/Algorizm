package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_25556 {
    public static void main(String[] args) {

        boolean isNumber = false;

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Stack<Integer>[] stacks = new Stack[4];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
        }
        for (int number : numbers) {
            for (int i = 0; i < 4; i++) {
                if (stacks[i].isEmpty() || stacks[i].peek() < number) {
                    stacks[i].push(number);
                    isNumber = true;
                    break;
                } else {
                    isNumber = false;
                }
            }
        }

        if(isNumber){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
