import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        boolean lowercase = false;
        boolean uppercase = false;
        boolean repeated = false;

        if (password.length() < 6 || password.length() > 20) {
            System.out.println("WEAK");
            return;
        }

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lowercase = true;
            }

            if (ch >= 'A' && ch <= 'Z') {
                uppercase = true;
            }

            if (i >= 2 &&
                password.charAt(i) == password.charAt(i - 1) &&
                password.charAt(i) == password.charAt(i - 2)) {

                repeated = true;
            }
        }

        if (lowercase && uppercase && !repeated) {
            System.out.println("STRONG");
        } else {
            System.out.println("WEAK");
        }
    }
}