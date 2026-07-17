import java.util.Scanner;
public class Bill_amount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        int bill = sc.nextInt();
        if(bill<1000){
            System.out.println("Delivery charges applied");
        }
        else{
            System.out.println("Delivery charges is not applied");
        }
    }
    
}
