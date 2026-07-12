import java.util.Scanner;
public class Average_of_three_subjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark 1:");
        int m1 = sc.nextInt();
        System.out.println("Enter the mark 2:");
        int m2 = sc.nextInt();
        System.out.println("Enter the mark 3:");
        int m3 = sc.nextInt();
        int Total = m1+m2+m3 ;
        System.out.println("Total of the three subjects:"+Total);
        double Avg = Total/3.0;
        System.out.println("Average of the three subjects :"+Avg);
        sc.close();
    }    
}
