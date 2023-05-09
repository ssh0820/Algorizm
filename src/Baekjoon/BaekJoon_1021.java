package Baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon_1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 범위와 Queue에서 뽑을 숫자의 개수를 입력해 주세요.");
        int volume = scanner.nextInt();
        int size = scanner.nextInt();


        Deque<Integer> queue = new LinkedList<Integer>();

        for(int i=0; i< volume; i++){
            queue.add(i+1);
        }
        System.out.println("Queue에서 뽑아낼 숫자를 입력해 주세요.");

        int[] numbers = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = scanner.nextInt();
        }

        int value = 0;
        int minNumber =0;

        while ( value < numbers.length){

            if(numbers[value]  == queue.peek()){
                queue.poll();
                value++;
            }else{
                int i1=0, i2=0;

                Deque<Integer> temp1 = new LinkedList<>();
                Deque<Integer> temp2 = new LinkedList<>();
                temp1.addAll(queue);
                temp2.addAll(queue);

                while (temp1.peek() != numbers[value]){
                    temp1.addLast(temp1.pollFirst());
                    i1++;
                }

                while (temp2.peek() != numbers[value]){
                    temp2.addFirst(temp2.pollLast());
                    i2++;
                }

                minNumber += Math.min(i1,i2);

                queue = i1 < i2 ? temp1 : temp2;
            }
        }

        System.out.println(minNumber);
    }
}
