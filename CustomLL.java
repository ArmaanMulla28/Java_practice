class Node{
    int data;
    Node next;

    Node head;
    Node tail;
    int size;

    
    
    void insertFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;

        }
        size += 1;

    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        
    }
    void insertatend(int data){
        if(head == null){
            insertFirst(data);
            return;

        }
        Node node = new Node();
        node.data = data;
        tail.next = node;
        
        tail = node;
        size++;
    }
    public static void main(String[] args) {
        Node N1 = new Node();
        N1.insertFirst(20);
        N1.insertFirst(30);
        N1.insertFirst(40);
        N1.insertFirst(50);
        N1.insertatend(78);
        N1.display();
    }
}


