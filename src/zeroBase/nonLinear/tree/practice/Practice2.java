package zeroBase.nonLinear.tree.practice;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    char data;
    Node left;
    Node right;

    public Node(char data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class BinaryTree2{
    Node head;

    BinaryTree2(){}
    BinaryTree2(char[] arr) {
        Node[] nodes = new Node[arr.length];
        for (int i = 0; i < arr.length; i++){
            nodes[i] = new Node(arr[i], null, null);
        }

        for(int i = 0; i < arr.length; i++){
            int left = 2 * i + 1;
            int right = 2 * i + 2;


            if(left < arr.length){
                nodes[i].left = nodes[left];
            }

            if(right < arr.length){
                nodes[i].right = nodes[right];
            }
        }
        this.head = nodes[0];
    }

        public void preOrderTraversal(Node node){
            if(node == null){
                return;
            }

            System.out.print(node.data + " ");
            this.preOrderTraversal(node.left);
            this.preOrderTraversal(node.right);

        }

    public void inOrderTraversal(Node node){
        if(node == null){
            return;
        }

        this.inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        this.inOrderTraversal(node.right);

    }

    public void postOrderTraversal(Node node){
        if(node == null){
            return;
        }

        this.postOrderTraversal(node.left);
        this.postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrderTraversal(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            System.out.print(cur.data + " ");
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

}

public class Practice2 {
    public static void main(String[] args) {
        //Test Code
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (char)('A' + i);
        }

        BinaryTree2 bt = new BinaryTree2(arr);
        System.out.println("== preOrderTraversal ==");
        bt.preOrderTraversal(bt.head);
        System.out.println();

        System.out.println("== inOrderTraversal ==");
        bt.inOrderTraversal(bt.head);
        System.out.println();

        System.out.println("== postOrderTraversal ==");
        bt.postOrderTraversal(bt.head);
        System.out.println();

        System.out.println("== levelOrderTraversal ==");
        bt.levelOrderTraversal(bt.head);
        System.out.println();

    }
}
