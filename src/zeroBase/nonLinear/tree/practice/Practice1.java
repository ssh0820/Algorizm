package zeroBase.nonLinear.tree.practice;

class BinaryTree {
    char[] arr;
    BinaryTree(char[] data) {
        this.arr = data.clone();
    }

    public void preOrderTraversal(int idx) {
        System.out.print(this.arr[idx] + " ");

        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        if (left < this.arr.length) {
            this.preOrderTraversal(left);
        }

        if (right < this.arr.length) {
            this.preOrderTraversal(right);
        }
    }

    public void inOrderTraversal(int idx){
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if(left < this.arr.length){
            this.inOrderTraversal(left);
        }

        System.out.print(this.arr[idx] + " ");

        if(right < this.arr.length){
            this.inOrderTraversal(right);
        }
    }

    public void postOrderTraversal(int idx){
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if(left < this.arr.length){
            this.postOrderTraversal(left);
        }

        if(right < this.arr.length){
            this.postOrderTraversal(right);
        }

        System.out.print(this.arr[idx] + " ");
    }

    public void levelOrderTraversal(){
        for (int i = 0; i < this.arr.length; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}
public class Practice1 {
    public static void main(String[] args) {
        //Test Code
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }

        BinaryTree bt = new BinaryTree(arr);

        System.out.println("== preOrderTraversal ==");
        bt.preOrderTraversal(0);
        System.out.println();

        System.out.println("== inOrderTraversal ==");
        bt.inOrderTraversal(0);
        System.out.println();

        System.out.println("== postOrderTraversal ==");
        bt.postOrderTraversal(0);
        System.out.println();

        System.out.println("== levelOrderTraversal ==");
        bt.levelOrderTraversal();
        System.out.println();
    }
}
