import java.util.Scanner;
public class Employee_salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Salary:");
        int Salary = sc.nextInt();
        if(Salary>50000){
            System.out.println("Eligible to get Bonus");
        }
    }

}
 
