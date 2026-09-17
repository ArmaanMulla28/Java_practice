public class CustomStack{
    int stack[];
    int ptr = -1;
    int size;
    int value;
    public CustomStack(int size){
        this.size = size;
        this.stack = new int[size];
    }
    public static boolean isEmpty(CustomStack stack){
        return stack.ptr == -1;
    }
    public static boolean isFull(CustomStack stack){
        return stack.ptr == stack.size - 1;
    }
    void push(int value){
        if (isFull(this)) {
            System.out.println("Stack is full");
        }
        else {
            ptr++;
            stack[ptr] = value;
            System.out.println("Pushed element: " + value);
        }
    }
    void pop(){
        if(isEmpty(this)){
            System.out.println("Stack is empty");
        }
        else{
            int value =stack[ptr];
            ptr--;
            System.out.println("Popped element: " + value);
        }
    }
    void peek(){
        if (isEmpty(this)){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element: " + stack[ptr]);
        }
    }
    public static void main (String[] args){
        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.peek();
        stack.pop();
        stack.peek();

    }
}