import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too Low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too High! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " tries.");
            }
        }

        sc.close();
    }
}