import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
    void preorder(Node root){
        
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
        Node current = stack.pop();
        System.out.println(current.data+"");
        if (current.left != null){
            stack.push(current.left);
        }
        if (current.right != null){
            stack.push(current.right);
        }
        }
        }

    void postorder(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while (!stack.isEmpty()){
            if (temp != null){
                if(temp.right != null){
                    stack.push(temp.right);
                    stack.push(temp);
                    temp = temp.left;
                }

            }
            if (stack.isEmpty()){
                return;
            }
            else{
                stack.pop(temp);

            }

        }
    }
}