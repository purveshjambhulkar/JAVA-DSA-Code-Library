import java.util.LinkedList;
import java.util.Stack;
import java.util.Dueue;



class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public void inorderTraversal(Node root){

        //BASE CASE
        if (root == null){
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data  + " ");
        inorderTraversal(root.right);
    }
    public void preorderTraversal(Node root){

        //BASE CASE
        if (root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void postorderTraversal(Node root){

        //BASE CASE
        if (root == null){
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");

    }



    //LEVEL ORDER TRAVERSAL
    public void levelOrderTraversal(Node root){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node temp = queue.peek();
            queue.remove();

            if(temp == null){

                System.out.println();
                if (!queue.isEmpty()){
                    queue.add(null);
                }
            }
            else{

                System.out.print(temp.data + " ");
                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
    }

    public void iterativeInorderTraversal(Node root){
        if (root == null){
            return;

        }

         tack<Node> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()){
            root = stack.pop();
            System.out.print(root.data + " ");
        if (root.right != null){
            stack.push(root.right);
        }
        if(root.left != null){
            stack.push(root.left);
        }


        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(10);
        root.right = new Node(66);
        root.left.left = new Node(23);
        root.left.right = new Node(42);
        root.right.left = new Node(224);
        root.right.right = new Node(12);



        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

        System.out.println("Preorder Traversal");
        root.preorderTraversal(root);
        System.out.println();

        System.out.println("Inorder Traversal");
        root.inorderTraversal(root);
        System.out.println();

        System.out.println("Postorder Traversal");
        root.postorderTraversal(root);
        System.out.println();

        System.out.println("Level Order Traversal");
        root.levelOrderTraversal(root);
        System.out.println();

        System.out.println("Iterative PreOrder Traversal");
        root.iterativeInorderTraversal(root);
    }
}
