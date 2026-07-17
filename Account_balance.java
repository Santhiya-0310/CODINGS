import java.util.Scanner;
public class Account_balance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account balance: ");
        int balance = sc.nextInt();
        if(balance!=0){
            System.out.println("Withdrawl allowed");
        }
        else{
            System.out.println("Withdrawl not allowed");
        }
    }
    
}
