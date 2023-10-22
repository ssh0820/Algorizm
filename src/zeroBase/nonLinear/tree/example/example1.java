package zeroBase.nonLinear.tree.example;

public class example1 {

    public static void solution(int n) {
        int[] binaryTree = new int[(int)Math.pow(2,n)];

        binaryTree[0] = 0;
        for(int i = 0; i < (int)Math.pow(2, n-1) - 1; i++){
            binaryTree[i * 2 +1] = 0;
            binaryTree[i * 2 +2] = 1;
        }

        inOrderTraversal(binaryTree, 0);
    }

    private static void inOrderTraversal(int[] arr, int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if(left < arr.length - 1){
            inOrderTraversal(arr, left);
        }

        System.out.println(arr[idx] + " ");

        if(right < arr.length - 1){
            inOrderTraversal(arr, right);
        }
    }

    public static void main(String[] args) {
        //Test Code
        solution(1);
        solution(2);
        solution(3);
    }
}
