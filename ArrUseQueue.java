class ArrUseQueue{
    int queue[];
    int front = -1;
    int rear = -1;
    public ArrUseQueue(int size) {
        queue = new int[size]; 
    }
    boolean isEmpty(){
        return front == -1;
    }
    boolean isFull(){
        return rear == queue.length - 1;
    }
    void enqueue(int value){
        if (isFull()){
            System.out.println("Queue is full.");
            return;
        }
        if (front == -1){
            front = 0;
        }
        rear++;
        queue[rear]= value;
    }
    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        if (front == rear){
            front = -1;
            rear =-1;
        } else {
            front++;
        }
        
    }
    int getfront(){
        if (isEmpty()){
            System.out.println("Queue is Empty.");
            return -1;
        }
        return queue[front];
    }
    int getrear(){
        if (isEmpty()){
            System.out.println("Queue is Empty.");
            return -1;
        }
        return queue[rear];
    }
    public static void main(String[] args) {
        ArrUseQueue q1= new ArrUseQueue(6);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.dequeue();
        q1.getfront();
        q1.getrear();
    }
}