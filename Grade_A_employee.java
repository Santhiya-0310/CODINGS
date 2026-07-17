import java.util.Scanner;
public class Grade_A_employee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary :");
        int salary = sc.nextInt();
        if(salary>=80000){
            System.out.println("GRADE A EMPLOYEE");
        }else if(salary>=50000){
            System.out.println("Eligible for bonus");
        }else{
            System.out.println("Not eligible");
        }
    }
    
}

