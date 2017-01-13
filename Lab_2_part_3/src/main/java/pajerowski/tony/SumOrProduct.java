package pajerowski.tony;

/**
 * Created by anthonypajerowski on 1/13/17.
 */
public class SumOrProduct {
    public int sumOfNumbers(int n) {
        int output = 0;
        for ( int i = 1; i <= n; i++ ) {
            output += i;
        }
        return output;
    }
    public int productOfNumbers(int n) {
        int output = 1;
        for ( int i = 1; i <= n; i++) {
            output *= i;
        }
        return output;
    }
   // public String pickAnOperation()

}
