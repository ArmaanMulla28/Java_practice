class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

    Node insert(Node root,int data){
        if (root == null){
            return new Node(data);
        }
        if (data<root.data){
            root.left = insert(root.left, data);
        }
        if(data>root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    Node delete(Node root , int data){
        if (root == null){
            return null;
        }
        if (data<root.data){
            root.left = delete(root.left, data);
        } else if(data>root.data){
            root.right = delete(root.right,data);
        } else {
            if (root.left == null && root.right == null){
                return null;            
            }
            if (root.left == null && root.right != null) {
                return root.right;
            }
            if (root.left != null && root.right == null){
                return root.left;
            }
            if (root.left != null && root.right != null){
                Node successor = findMin(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
            }
            return root;
        }
        void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

    
    class BST {
        public static void main(String[] args) {
            Node root = new Node(6);

        // Insert nodes
        root = root.insert(root, 16);
        root = root.insert(root, 3);
        root = root.insert(root, 8);
        root = root.insert(root, 20);
        root = root.insert(root, 1);
        root = root.insert(root, 5);

        System.out.println("Before deletion:");
        root.inorder(root);

        // Delete 6
        root = root.delete(root, 6);

        System.out.println("\nAfter deletion:");
        root.inorder(root);
    }

    }