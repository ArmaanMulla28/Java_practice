class Node {
    int data;
    Node next;
}
class SinglyLL {
    Node head;
    
    void insertatfirst(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = head;
        head = newNode;
        
    }
    void insertatend(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        if(head == null){
            insertatfirst(value);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void insertatanyposition(int value, int position){

    if(position <= 0){
        System.out.println("Invalid Position");
        return;
    }

    if(position == 1){
        insertatfirst(value);
        return;
    }

    if(head == null){
        System.out.println("Invalid Position");
        return;
    }

    Node temp = head;

    for(int i = 1; i < position - 1; i++){

        if(temp.next == null){
            System.out.println("Invalid Position");
            return;
        }

        temp = temp.next;
    }

    Node newNode = new Node();
    newNode.data = value;
    newNode.next = temp.next;
    temp.next = newNode;
}
    void deletefromfirst(){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        }
        head = head.next;
    }
    void deletefromend(){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    void deletefromanyposition(int position){
        if(position <=0){
            System.out.println("Invalid Position");
            return;
        }
        if(position == 1){
            deletefromfirst();
            return;
        }
        if (head == null){
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp = head ;
        for (int i = 1; i < position - 1; i++) {
            temp =  temp.next;
            }
            if (temp.next == null){
                System.out.println("Invalid Position");
                return;
        }
        temp.next = temp.next.next;
    }
    void updating(int value, int position){
        if (position <= 0){
            System.out.println("Invalied Position.");
        }
        if(head ==null){
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        for (int i = 1; i < position; i++) {
            if(temp.next == null){
                System.out.println("Invalid Position.");
            }
            temp = temp.next;
        }
        temp.data = value;

    }
    void searching(int value){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        
        while(temp != null){
            
            if(temp.data == value){
                System.out.println("element found.");
                return;
            }
            temp =temp.next;
        }
        System.out.println("Not found!!");
    }
    int lenght(){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;;
            temp = temp.next;

        }
        return count;
    }
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
            
        }
    }
    public static void main(String[] args) {
        SinglyLL l1 = new SinglyLL();
        l1.insertatfirst(14);
        l1.insertatfirst(15);
        l1.insertatfirst(16);
        l1.insertatfirst(17);
        l1.insertatfirst(18);
        l1.insertatend(13);
        l1.deletefromend();
        l1.deletefromfirst();
        l1.updating(23, 2);
        l1.deletefromanyposition(3);
        l1.searching(17);
        l1.insertatanyposition(34, 5);
        l1.lenght();
        l1.display();
        
        
    }
}