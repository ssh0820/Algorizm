package zeroBase.Math_03;

import java.util.ArrayList;

public class Practice {

    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();

        for (int i = 1; i<= (int)num/2; i++){
            if(num % i ==0){
                result.add(i);
            }
        }
        result.add(num);

        return result;
    }

    public int getGCD(int numA, int numB){
        int gcd = -1;

        ArrayList divisorA = this.getDivisor(numA);
        ArrayList divisorB = this.getDivisor(numB);

        for(int itemA: (ArrayList<Integer>)divisorA){
            for(int itemB: (ArrayList<Integer>)divisorB ){
                if(itemA == itemB){
                    if(itemA > gcd){
                        gcd = itemA;
                    }
                }
            }
        }
        return gcd;
    }

    public int getLCM(int numA, int numB){
        int lcm = -1;

        int gcd = this.getGCD(numA,numB);

        if(gcd != -1){
            lcm = numA * numB / gcd;
        }

        return lcm;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 6;

        Practice p = new Practice();
        ArrayList l1 = p.getDivisor(number1);
        ArrayList l2 = p.getDivisor(number2);
        System.out.println("l1 = "+ l1);
        System.out.println("l1 = "+ l2);

        System.out.println("최대 공약수: "+p.getGCD(number1,number2));
        System.out.println("최소 공배수: "+p.getLCM(number1,number2));
    }
}
