package pajerowski.tony;

/**
 * Created by anthonypajerowski on 1/12/17.
 */

public class UserNumbers {
    int totalOfNumbers;

    public int addTheNumbers(int userInput) {
        for ( int i = 1; i <= userInput ; i++) {
            totalOfNumbers +=i;
        }
        return totalOfNumbers;
    }

}
