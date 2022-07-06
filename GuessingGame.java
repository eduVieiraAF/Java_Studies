import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("WELCOME");
        System.out.println("What's you name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println();
        System.out.println("Hello, " + name);
        System.out.println();

        System.out.println("Let's begin?");
        System.out.println("\t 1. YES");
        System.out.println("\t 2. NO");
        int begin = scanner.nextInt();

        while (begin != 1) {
            System.out.println();
            System.out.println("Let's begin?");
            System.out.println("\t 1. YES");
            System.out.println("\t 2. NO");
            begin = scanner.nextInt();
        }
        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("Guess a number between 1 and 20:");
        int userGuess = scanner.nextInt();

        int tries = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            tries++;

            if (tries < 5) {
                if (userGuess == x) {
                    hasWon = true;
                    shouldFinish = true;
                } else if (userGuess > x) {
                    System.out.println("Guess lower");
                    userGuess = scanner.nextInt();
                } else {
                    System.out.println("Guess higher");
                    userGuess = scanner.nextInt();
                }
            } else {
                shouldFinish = true;
            }
        }
        if (hasWon) {
            System.out.println(name + ", it took you " + tries + " guesses.");
        } else {
            System.out.println("GAME OVER");
            System.out.println("The number is " + x);
        }
    }
}