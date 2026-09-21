class ArrUseDEQueue{
    int arr [];
    int front = -1;
    int rear = -1 ;

    public ArrUseDEQueue(int size) {
        arr = new int[size];
    }
    
    boolean isEmpty(){
        if(front == -1 || rear == -1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if((rear+1)%arr.length==front){
            return true;
        }else{
            return false;
        }
    }
    void insertatfront(int value){
        if (isFull()){
            System.out.println("Dequeue full.");
            return;
        }
        if (front ==-1){
            front = 0;
            rear = 0;
        }else{
            front = (front-1+arr.length)%arr.length;
        }
        
        arr[front]=value;
    }
    void insertatrear(int value){
        if (isFull()){
            System.out.println("Dequeue Full.");
            return;
        }
        if (front ==-1){
            front = 0;
            rear =0;
        }else{
             rear = (rear+1)%arr.length;
        }
       
        arr[rear]=value;
    }
    void deletefromfront(){
        if(isEmpty()){
            System.out.println("Dequeue Empty.");
            return;
        }
        if(front == rear){
            front = -1;
            rear =-1;
        }else{
            front = (front+1)%arr.length;
        }

    }
    void deletefromrear(){
        if(isEmpty()){
            System.out.println("Dequeue Empty.");
            return;
        }
        if(front == rear){
            front = -1;
            rear =-1;
        }else{
            rear = (rear-1+arr.length)%arr.length;
        }

    }
    int getfront(){
        if(isEmpty()){
            System.out.println("Dequeue Empty.");
            return -1;
        }
        return arr[front];
    }
    int getrear(){
        if(isEmpty()){
            System.out.println("Dequeue Empty.");
            return -1;
        }
        return arr[rear];
    }
    public static void main(String[] args) {
        ArrUseDEQueue DE = new ArrUseDEQueue(10);
        DE.insertatfront(10);
        DE.insertatfront(30);
        DE.insertatrear(20);
        DE.insertatrear(80);
        DE.deletefromfront();
        DE.deletefromrear();
        System.out.println(DE.getfront());
        System.out.println(DE.getrear());
        


    }
    
}
