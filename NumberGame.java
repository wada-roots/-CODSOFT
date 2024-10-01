import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "y";

        int totalRounds = 0;
        int totalAttempts = 0;
        int roundsWon = 0;

        while (playAgain.equalsIgnoreCase("y")) {
            int randomNumber = random.nextInt(101);
            int attempts = 0;
            int maxAttempts = 5;
            System.out.println("I'm thinking of a number between 1 and 100.");
            while (attempts < maxAttempts) {
                attempts++;
                System.out.print("Enter your guess (1 to 100): ");
                int userGuess = scanner.nextInt();

                if (userGuess > randomNumber) {
                    System.out.println("Too high!");
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Correct!" + "You've Won");
                    roundsWon++;
                    break;
                }
                if (attempts == maxAttempts) {
                    System.out.println("You've reached the maximum number of attempts.The correct number was " + randomNumber);
                }
            }

            totalRounds++;
            totalAttempts += attempts;

            System.out.println("Do you want to play again? (y/n): ");
            playAgain = scanner.next();
        }

        System.out.println("Game Over!");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Total attempts: " + totalAttempts);
    }
}
