import java.util.*;
class Calculator{
    static Scanner sc = new Scanner(System.in);
    int[] arr;

    Calculator(){
        System.out.println("Welcome to the Calculator Program!");
    }
    Calculator(int size){
        arr = new int[size];
        System.out.println("Calculator initialized with " + size + " numbers.");
    }
        void Numbers(Scanner sc){
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String args[]){
        System.out.print("Enter the number of values: ");
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("Number of values must be greater than zero.");
            return;
      }
        Calculator calc = new Calculator(size);
        int choice = 1;
        
        while(choice!=9){
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Average");
            System.out.println("7. Cube");
            System.out.println("8. Square");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    calc.Numbers(sc);
                    calc.sum();
                    break;
                case 2:
                    calc.Numbers(sc);
                    calc.subtract();
                    break;
                case 3:
                    calc.Numbers(sc);
                    calc.multiply();
                    break;
                case 4:
                    calc.Numbers(sc);
                    calc.divide();
                    break;
                case 5:
                    calc.Numbers(sc);
                    calc.modulus();
                    break;
                case 6:
                    calc.Numbers(sc);
                    calc.average();
                    break;
                case 7:
                    calc.Numbers(sc);
                    calc.cube();
                    break;
                case 8:
                    calc.Numbers(sc);
                    calc.square();
                    break;
                case 9:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    
                    System.out.println("Invalid choice! Please enter a number between 1 and 9.");
        
            }
        }
        
        
    }

    void sum(){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
        sum = sum + arr[i];
    }
    System.out.println("Sum: " + sum);
    }
    void subtract(){
    int sub = arr[0];
    for(int i=1;i<arr.length;i++){
        sub = sub - arr[i];
    }
    System.out.println("Subtraction: " + sub);
    }
    void multiply(){
    int mul = 1;
    for(int i=0;i<arr.length;i++){
        mul = mul * arr[i];
    }
    System.out.println("Multiplication: " + mul);
    }
    void divide(){
    int div = arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]==0){
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        div = div / arr[i];
        
    }
    System.out.println("Division: " + div);
    }
    void modulus(){
    int mod = arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]==0){
            System.out.println("Error: Modulus by zero is not allowed.");
            return;
        }
        mod = mod % arr[i];
        
    }
    System.out.println("Modulus: " + mod);
    }
    void average(){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
        sum = sum + arr[i];
    }
    double avg = (double)sum/arr.length;
    System.out.println("Average: " + avg);
    }
    void cube(){
    for(int i=0;i<arr.length;i++){
        int cube = arr[i] * arr[i] * arr[i];
        System.out.println("Cube of " + arr[i] + " is: " + cube);
    }
    }
    void square(){
    for(int i=0;i<arr.length;i++){
        int square = arr[i] * arr[i];
        System.out.println("Square of " + arr[i] + " is: " + square);
    }
    }
}