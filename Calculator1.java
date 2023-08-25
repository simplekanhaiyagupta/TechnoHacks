import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("-----------------------------------------------");
        System.out.println("Welcome To Simple  Calculator Opration  in Java ");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Addition ");
        System.out.println("2. Substractino ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division  ");
        System.out.println("                                 ");
        System.out.print("Please Enter your choice your number   : ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Enter First Number   : ");
                a = sc.nextInt();
                System.out.print("Enter Second Number  : ");
                b = sc.nextInt();
                c = a + b;
                System.out.print("Addition = " + c);
                break;
            case 2:
                System.out.print("Enter First Number   : ");
                a = sc.nextInt();
                System.out.print("Enter Second Number  : ");
                b = sc.nextInt();
                c = a - b;
                System.out.print("Substraction  = " + c);
                break;
            case 3:
                System.out.print("Enter First Number   : ");
                a = sc.nextInt();
                System.out.print("Enter Second Number  : ");
                b = sc.nextInt();
                c = a * b;
                System.out.print("Multiplication = " + c);
                break;
            case 4:
                System.out.print("Enter First Number  : ");
                a = sc.nextInt();
                System.out.print("Enter Second Number : ");
                b = sc.nextInt();
                c = a / b;
                System.out.print("Divisoin = " + c);
                break;
            default:
                System.out.print("Invalid Input ");

        }

    }
}
