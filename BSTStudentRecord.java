<<<<<<< HEAD
import java.util.Scanner;
class Node {
    int rollNo;
    Node left, right;
    Node(int rollNo) {
        this.rollNo = rollNo;
        left = right = null;
    }
}
class BST {
    Node root;

    Node insert(Node root, int rollNo) {
        if (root == null)
            return new Node(rollNo);

        if (rollNo < root.rollNo)
            root.left = insert(root.left, rollNo);
        else if (rollNo > root.rollNo)
            root.right = insert(root.right, rollNo);

        return root;
    }
    boolean search(Node root, int rollNo) {
        if (root == null)
            return false;

        if (root.rollNo == rollNo)
            return true;

        if (rollNo < root.rollNo)
            return search(root.left, rollNo);

        return search(root.right, rollNo);
    }
    Node minValue(Node root) {
        while (root.left != null)
            root = root.left;

        return root;
    }
    Node delete(Node root, int rollNo) {
        if (root == null)
            return null;

        if (rollNo < root.rollNo) {
            root.left = delete(root.left, rollNo);
        } else if (rollNo > root.rollNo) {
            root.right = delete(root.right, rollNo);
        } else {
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node successor = minValue(root.right);
            root.rollNo = successor.rollNo;
            root.right = delete(root.right, successor.rollNo);
        }

        return root;
    }
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.rollNo + " ");
            inorder(root.right);
        }
    }
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.rollNo + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.rollNo + " ");
        }
    }
}

public class BSTStudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int choice, rollNo;

        do {
            System.out.println("\n\n--- Student Roll Number BST ---");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Postorder Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter roll number: ");
                    rollNo = sc.nextInt();
                    tree.root = tree.insert(tree.root, rollNo);
                    System.out.println("Roll number inserted.");
                    break;

                case 2:
                    System.out.print("Enter roll number to search: ");
                    rollNo = sc.nextInt();
                    if (tree.search(tree.root, rollNo))
                        System.out.println("Roll number found.");
                    else
                        System.out.println("Roll number not found.");
                    break;

                case 3:
                    System.out.print("Enter roll number to delete: ");
                    rollNo = sc.nextInt();
                    if (tree.search(tree.root, rollNo)) {
                        tree.root = tree.delete(tree.root, rollNo);
                        System.out.println("Roll number deleted.");
                    } else {
                        System.out.println("Roll number not found.");
                    }
                    break;

                case 4:
                    System.out.print("Inorder: ");
                    tree.inorder(tree.root);
                    break;

                case 5:
                    System.out.print("Preorder: ");
                    tree.preorder(tree.root);
                    break;

                case 6:
                    System.out.print("Postorder: ");
                    tree.postorder(tree.root);
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}
=======
import java.util.Scanner;
class Node {
    int rollNo;
    Node left, right;
    Node(int rollNo) {
        this.rollNo = rollNo;
        left = right = null;
    }
}
class BST {
    Node root;

    Node insert(Node root, int rollNo) {
        if (root == null)
            return new Node(rollNo);

        if (rollNo < root.rollNo)
            root.left = insert(root.left, rollNo);
        else if (rollNo > root.rollNo)
            root.right = insert(root.right, rollNo);

        return root;
    }
    boolean search(Node root, int rollNo) {
        if (root == null)
            return false;

        if (root.rollNo == rollNo)
            return true;

        if (rollNo < root.rollNo)
            return search(root.left, rollNo);

        return search(root.right, rollNo);
    }
    Node minValue(Node root) {
        while (root.left != null)
            root = root.left;

        return root;
    }
    Node delete(Node root, int rollNo) {
        if (root == null)
            return null;

        if (rollNo < root.rollNo) {
            root.left = delete(root.left, rollNo);
        } else if (rollNo > root.rollNo) {
            root.right = delete(root.right, rollNo);
        } else {
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node successor = minValue(root.right);
            root.rollNo = successor.rollNo;
            root.right = delete(root.right, successor.rollNo);
        }

        return root;
    }
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.rollNo + " ");
            inorder(root.right);
        }
    }
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.rollNo + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.rollNo + " ");
        }
    }
}

public class BSTStudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int choice, rollNo;

        do {
            System.out.println("\n\n--- Student Roll Number BST ---");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Postorder Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter roll number: ");
                    rollNo = sc.nextInt();
                    tree.root = tree.insert(tree.root, rollNo);
                    System.out.println("Roll number inserted.");
                    break;

                case 2:
                    System.out.print("Enter roll number to search: ");
                    rollNo = sc.nextInt();
                    if (tree.search(tree.root, rollNo))
                        System.out.println("Roll number found.");
                    else
                        System.out.println("Roll number not found.");
                    break;

                case 3:
                    System.out.print("Enter roll number to delete: ");
                    rollNo = sc.nextInt();
                    if (tree.search(tree.root, rollNo)) {
                        tree.root = tree.delete(tree.root, rollNo);
                        System.out.println("Roll number deleted.");
                    } else {
                        System.out.println("Roll number not found.");
                    }
                    break;

                case 4:
                    System.out.print("Inorder: ");
                    tree.inorder(tree.root);
                    break;

                case 5:
                    System.out.print("Preorder: ");
                    tree.preorder(tree.root);
                    break;

                case 6:
                    System.out.print("Postorder: ");
                    tree.postorder(tree.root);
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}
>>>>>>> ccf2e7f8082009b4aeb078bb025ce8fddaf4f976
