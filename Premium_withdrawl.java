import java.util.Scanner;
public class Premium_withdrawl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance :");
        int balance = sc.nextInt();
        if(balance>=10000){
            System.out.println("Premium account withdrawl");
        }else if(balance>=5000){
            System.out.println("withdrawl allowed");
        }else{
            System.out.println("insufficient balance");
        }
    }
    
}


