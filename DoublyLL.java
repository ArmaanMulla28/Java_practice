class Node{
    int data;
    Node next;
    Node prev;
    Node(){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
class DoublyLL{
    Node head;
    Node tail;
    void displayforward(){
        if (head == null){
            System.out.println("Empty!!");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    void displayback(){
        if (head == null){
            System.out.println("Empty!!");
            return;
        }
        Node temp = tail;
        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.prev;
        }

    }
    void insertatfirst(int value){
        Node newNode = new Node();
        newNode.data = value;
        if (head == null){
            head = newNode;
            tail = newNode;

            newNode.next = null;
            newNode.prev =null;
            return;

        }
        newNode.next = head;
        head.prev=newNode;
        newNode.prev =null;
        head = newNode;

    }
     void insertatend(int value){
        Node newNode = new Node();
        newNode.data = value;
        if (head == null){
            head = newNode;
            tail = newNode;

            newNode.next = null;
            newNode.prev =null;
            return;
        }
        newNode.prev = tail;
        tail.next=newNode;
        newNode.next=null;
        tail = newNode;

    }
    void insertatanyposition(int value,int position){
        if (position <=  0){
            
        }
    }
    public static void main(String[] args) {
        DoublyLL DL = new DoublyLL();
        DL.insertatfirst(10);
        DL.insertatfirst(20);
        DL.insertatfirst(30);
        DL.insertatfirst(40);
        DL.insertatfirst(50);
        DL.insertatend(45);
        DL.displayback();
    }
}