import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int l = 1;
        int u = 100;
        int numberguess = random.nextInt(u - l + 1) + l;
        int numberGs = 0;
        boolean hasg = false;
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Number Guessing Game?");
        System.out.println("----------------------------------------");
        System.out.println("Gusess the  number between " + l + " and " + u + ".");

        while (!hasg) {
            System.out.print("Enter your guess the number : ");
            int user = scanner.nextInt();
            numberGs++;

            if (user < numberguess) {
                System.out.println("Too low! Try again.");
            } else if (user > numberguess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + numberguess + " guesses.");
                hasg = true;
            }
        }

        scanner.close();
    }
}
