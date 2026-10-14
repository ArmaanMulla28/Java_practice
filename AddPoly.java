import java.util.*;
class Node {
    int exp;
    int coeff;
    Node next;
    Node(int coeff, int exp){
        this.exp = exp;
        this.next = null;
        this.coeff = coeff;
    }
    Node PolyAdd(Node p, Node q){
        Node head = null;
        Node tail = null;
        while( p != null && q != null){
            int exp;
            int coeff;
            if (p.exp == q.exp){
                coeff = p.coeff + q.coeff;
                exp = p.exp;
                p = p.next;
                q = q.next;
            }
            else if (p.exp > q.exp){
                coeff = p.coeff;
                exp = p.exp;
                p =p.next;
                
            }
            else {
                coeff = q.coeff;
                exp = q.exp;
                q = q.next;
            }
            Node newNode = new Node(coeff,exp);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }

        }
        while (p!=null){
            Node newNode = new Node(coeff,exp);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            p =p.next;
        }
        while (q!=null){
            Node newNode = new Node(coeff,exp);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            q=q.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}