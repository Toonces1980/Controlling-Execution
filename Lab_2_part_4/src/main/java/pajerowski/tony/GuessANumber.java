package pajerowski.tony;
import java.util.*;
/**
 * Created by anthonypajerowski on 1/12/17.
 */
public class GuessANumber {

    int secretNumber = (int) (Math.random() * 10);
    Set<Integer> allGuesses = new HashSet<Integer>();
    int counter;
    boolean knowsSecret = false;

    public boolean isSecret(int guess) {
        if (guess == secretNumber) {
            return true;
        } else return false;
    }

    public int makeGuess(int guess) {
        if (allGuesses.contains(guess)) {
            return counter;
        } else
            allGuesses.add(guess);
            counter++;
            return counter;
    }
}
