class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    void inorder(TreeNode root){
        if (root ==  null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+"");
        inorder(root.right);

    }
    void preorder(TreeNode root){
        if (root ==  null){
            return;
        }
        System.out.println(root.data+"");
        inorder(root.left);
        inorder(root.right);

    }
    void postorder(TreeNode root){
        if (root ==  null){
            return;
        }
       
        inorder(root.left);
        inorder(root.right);
         System.out.println(root.data+"");

    }
    
    
    public static void main(String[] args) {
        TreeNode N1 = new TreeNode(6);
        TreeNode N2 = new TreeNode(5);
        TreeNode N3 = new TreeNode(4);
        N1.inorder(N1);
        N2.preorder(N2);
        N3.postorder(N3);
    }
}