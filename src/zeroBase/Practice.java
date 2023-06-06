package zeroBase;


import java.util.ArrayList;

class MySet1{
    ArrayList<Integer> list;

    MySet1(){
        this.list = new ArrayList<Integer>();
    }

    MySet1(int[] arr){
        this.list = new ArrayList<Integer>();

        for (int item : arr){
            this.list.add(item);
        }
    }

    public void add(int x){
        for (int item : this.list){
            if(item == x){
                return;
            }
        }
        this.list.add(x);
    }

    public MySet1 retainAll(MySet1 b){
        MySet1 result = new MySet1();

        for (int itemA : this.list){
            for (int itemB : b.list){
                if(itemA == itemB){
                    result.add(itemA);
                }
            }
        }
        return result;
    }

    public MySet1  addAll(MySet1 b){
        MySet1 result = new MySet1();

        for (int itemA : this.list){
            result.add(itemA);
        }

        for (int itemB : b.list){
            result.add(itemB);
        }
        return result;
    }

    public MySet1 removeAll(MySet1 b){
        MySet1 result = new MySet1();

        for (int itemA : this.list){
            boolean containFlag = false;

            for (int itemB : b.list){
                if(itemA == itemB){
                    containFlag = true;
                    break;
                }
            }
            if(!containFlag){
                result.add(itemA);
            }
        }
        return result;
    }

}


public class Practice {
    public static void main(String[] args) {

    MySet1 a = new MySet1();

    a.add(1);
    a.add(1);
    a.add(1);
    System.out.println(a.list);
    a.add(2);
    a.add(3);
    System.out.println(a.list);

    a = new MySet1(new int[]{1, 2, 3, 4, 5});
    MySet1 b = new MySet1(new int[]{2, 4, 6, 8, 10});
    System.out.println("a: "+a.list);
    System.out.println("b: "+b.list);

    MySet1 result = a.retainAll(b);
    System.out.println("교집합: "+ result.list);


    result = a.addAll(b);
    System.out.println("합집합: "+ result.list);


    result = a.removeAll(b);
    System.out.println("차집합: "+ result.list);


    }
}
