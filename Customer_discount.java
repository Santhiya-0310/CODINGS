import java.util.Scanner;
public class Customer_discount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill:");
        int bill = sc.nextInt();
        if(bill>=80000){
            System.out.println("20% discount applied ");
        }else if(bill>=50000){
            System.out.println("10% discount applied");
        }else{
            System.out.println("No discount");
        }
    }
    
}


