package zeroBase.Math_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) {

        System.out.println("== 합의 법칙 ==");

        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        int nA = 0;
        int nB = 0;
        int nAndB = 0;

        for (int item1: dice1){
            for (int item2: dice2){
                if((item1 + item2) % 3 == 0){
                    nA += 1;
                }

                if((item1 + item2) % 4 == 0){
                    nB += 1;
                }

                if ((item1 + item2) % 12 == 0){
                    nAndB += 1;
                }
            }
        }
        System.out.println("결과: " + (nA + nB - nAndB));

        HashSet<ArrayList> allCase = new HashSet<>();
        for (int item1: dice1){
            for (int item2: dice2){
                if((item1 + item2) % 3 ==0 || (item1 + item2) % 4 == 0){
                    ArrayList list = new ArrayList(Arrays.asList(item1,item2));
                    allCase.add(list);
                }
            }
        }
        System.out.println("결과: "+allCase.size());

        System.out.println("== 곱의 법칙 ==");

        nA = 0;
        nB = 0;

        for (int item1: dice1){
            if(item1 % 3 == 0){
                nA++;
            }
        }
        for (int item2: dice2){
            if(item2 % 4 == 0){
                nB++;
            }
        }

        System.out.println("결과: "+ (nA * nB));

    }
}
