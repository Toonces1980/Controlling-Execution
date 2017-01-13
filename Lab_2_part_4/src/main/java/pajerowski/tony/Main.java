package pajerowski.tony;

import java.util.Scanner;

/**
 * Created by anthonypajerowski on 1/13/17.
 */

public class Main {

    public static void main(String[] args) {
        GuessANumber guesser = new GuessANumber();
        Scanner sc = new Scanner(System.in);
        while (guesser.knowsSecret == false) {
            System.out.println("Try to guess the number between 1 and 10");
            int guess = sc.nextInt();
            guesser.makeGuess(guess);
            guesser.knowsSecret = guesser.isSecret(guess);
        }
        System.out.println("You guessed the number in " + guesser.counter + " unique guesses!");
    }
}