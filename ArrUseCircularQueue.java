class ArrUseCircularQueue{
    int arr[];
    int front = -1;
    int rear = -1;

    public ArrUseCircularQueue(int size) {
        arr = new int[size];
    }
    
    void enqueue(int value){
        if ((rear + 1) % arr.length == front){
            System.out.println("Queue Full.");
            return;
        }
        if (front == -1){
            front =0;
        }
        rear = (rear+1)%arr.length;
        arr[rear]= value;
    }
    void dequeue(){
        if (front == -1){
            System.out.println("Queue Empty.");
            return;
        }
        if (front == rear){
            front = -1;
            rear = -1;
            
        }
        else{
            front = (front+1)%arr.length;
        }
    }
    int getfront(){
        if (front == -1){
            System.out.println("Queue Empty.");
            return -1;
        }
        return arr[front];
    }
    int getrear(){
         if (front == -1){
            System.out.println("Queue Empty.");
            return -1;
        }
        return arr[rear];
    }
    public static void main(String[] args) {
        ArrUseCircularQueue CQ = new ArrUseCircularQueue(10);
        CQ.enqueue(10);
        CQ.enqueue(20);
        CQ.enqueue(30);
        CQ.enqueue(40);
        CQ.dequeue();
        System.out.println(CQ.getfront());
        System.err.println(CQ.getrear());
    }
}