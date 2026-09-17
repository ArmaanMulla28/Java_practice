import java.util.Scanner;
public class CustomStack{
    String stack[];
    int ptr = -1;
    int size;
    public CustomStack(int size){
        this.size = size;
        this.stack = new String[size];
    }
    public static boolean isEmpty(CustomStack stack){
        return stack.ptr == -1;
    }
    public static boolean isFull(CustomStack stack){
        return stack.ptr == stack.size - 1;
    }
    String push(String value){
        if (isFull(this)) {
            System.out.println("Stack is full");
            return null;
        }
        else {
            ptr++;
            stack[ptr] = value;
            System.out.println(value);
            return value;
        }
    }
    String pop(){
        if(isEmpty(this)){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            String value =stack[ptr];
            ptr--;
            System.out.println("Current website: " + value);
            return value;
        }
    }
    String peek(){
        if (isEmpty(this)){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            System.out.println("Current website: " + stack[ptr]);
            return stack[ptr];
        }
    }
    void display(){
        if (isEmpty(this)){
            System.out.println("No history available");
        }
        else{
            System.out.println("Browesing history: ");
            for (int i = ptr; i >= 0; i--){
                System.out.println(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        sc.nextLine();  
        CustomStack stack = new CustomStack(size);
        while (true){
            System.out.println("1. Visit Website");
            System.out.println("2. Go Back");
            System.out.println("3. Current Website");
            System.out.println("4. Display History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter the website URL: ");
                    System.out.println("Type 'exit' to stop visiting websites.");
                    while (!isFull(stack)) {
                        String value = sc.nextLine();
                        
                        if(value.equals("exit")) {
                            System.out.println("Exiting website visit.");
                            break;
                        }
                        stack.push(value);
                    }
                    
                    System.out.println("Stack is full. Cannot add more websites.");
                    break;
                    
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
        
    }
}