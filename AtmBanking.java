import java.util.*;
class AtmBanking{
    double balance = 1000;

    Scanner sc = new Scanner(System.in);
void CreateAccount(Scanner sc){
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter your account number: ");
    String accountNumber = sc.nextLine();
    System.out.println("Account created successfully for " + name + " with account number " + accountNumber);
}
int PINLogin(Scanner sc){
    System.out.print("Enter your PIN: ");
    int pin = sc.nextInt();
    if(pin == 1234){
        System.out.println("PIN accepted. You can now access your account.");
        return pin;
    } else {
        System.out.println("Incorrect PIN. Please try again.");
        return -1;
    }
}
public int Checkbalance(){
    
    System.out.println("Your current balance is: $1000");
    return 1000;
}
public int deposit(Scanner sc){
    System.out.println("Enter the amount you want to deposit::");
    double deposit =sc.nextDouble();
    System.out.println("You have deposited: $" + deposit);
    balance += deposit;
    System.out.println("Your new balance is: $" + balance);
    return (int)balance;
}
public int withdraw(Scanner sc){
    System.out.println("Enter the amount you want to withdraw::");
    double withdraw = sc.nextDouble();
    if(withdraw <= balance){
        System.out.println("You have withdrawn: $" + withdraw);
        balance -= withdraw;
        System.out.println("Your new balance is: $" + balance);
        return (int) balance;
    } else {
        System.out.println("Insufficient balance. You cannot withdraw more than your current balance.");
        return (int) balance;
    }
}
public void exit(){
    System.out.println("Thank you for using our ATM Banking services. Have a great day!");
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    AtmBanking atm = new AtmBanking();
    int choice = 0;
    while(choice != 6){
        System.out.println("Welcome to the ATM Banking Program!");
        System.out.println("1. Create Account");
        System.out.println("2. PIN Login");
        System.out.println("3. Check Balance");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine(); // Consume newline
        switch(choice){
            case 1:
                atm.CreateAccount(sc);
                break;
            case 2:
                atm.PINLogin(sc);
                break;
            case 3:
                if(atm.PINLogin(sc) == 1234){
                    atm.Checkbalance();
                } else {
                    System.out.println("Incorrect PIN. Please try again.");
                }
                break;
            case 4:
                if(atm.PINLogin(sc) == 1234){
                    atm.deposit(sc);
                } else {
                    System.out.println("Incorrect PIN. Please try again.");
                }
                
                break;
            case 5:
                if(atm.PINLogin(sc) == 1234){
                    atm.withdraw(sc);
                } else {
                    System.out.println("Incorrect PIN. Please try again.");
                }
                break;
            case 6:
                atm.exit();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
}