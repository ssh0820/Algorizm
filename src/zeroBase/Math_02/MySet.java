package zeroBase.Math_02;

import java.util.Arrays;
import java.util.HashSet;

public class MySet {
    public static void main(String[] args) {

        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        System.out.println("set1 = "+ set1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = "+ set1);
        set1.remove(1);
        System.out.println("set1 = "+ set1);
        System.out.println(set1.size());
        System.out.println(set1.contains(2));

        System.out.println("== 집합 연산 ==");

        HashSet a = new HashSet(Arrays.asList(1,2,3,4,5));
        HashSet b = new HashSet(Arrays.asList(2,4,6,8,10));

        a.retainAll(b);


        a.addAll(b);


        a.retainAll(b);

        System.out.println();

    }
}
