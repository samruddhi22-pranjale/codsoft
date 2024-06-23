import java.util.Scanner;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposite(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Deposite successful.new balance:"+balance);
        }
        else{
            System.out.println("invalid amount for deposite.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance-= amount;
            System.out.println("withdrawal successful.new balance:"+ balance);
        }
        else{
            System.out.println("invalid amount for withdrawal");
        }
    }
}
class ATM{
    private BankAccount account;
    private Scanner scanner;
     
    public ATM(BankAccount account){
        this.account=account;
        this.scanner=new Scanner(System.in);
    }
    public void showMenu(){
        System.err.println("1.check balance");
        System.out.println("2.deposite");
        System.out.println("3.withdraw");
        System.out.println("4.exit");
    }
    public void run(){
        int choice;
        do{
            showMenu();
            System.out.print("enter your choice");
            choice = scanner.nextInt();
                switch(choice) {
                 case 1 :
                checkBalance();
                break;
                 case 2 :
                deposite();
                break;
                 case 3 :
                withdraw();
                break;
                 case 4:
                System.out.println("Thank you for using the ATM");
                break;
                 default :
                System.out.println("invalid choice.please selecta valid option");
            }
        }while(choice !=4);
    }
    private void checkBalance(){
        System.out.println("your current balance is:"+ account.getBalance());
    }
    private void deposite(){
        System.out.println("enter the amount to deposite:");
        double amount = scanner.nextDouble();
        account.deposite(amount);
    }
    private void withdraw(){
        System.out.println("enter the amount to withdraw");
        double amount=scanner.nextDouble();
        account.withdraw(amount);
    }
    }
public class AtmInterface{
    public static void main(String args[]){
            System.out.println("welcome to the ATM");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your four digit PIN");
            int enteredpin=sc.nextInt();
        BankAccount userAccount = new BankAccount(initial balance:10000);
        ATM atm= new ATM(userAccount);
        atm.run();
    }
}