package pajerowski.tony;

import java.util.Scanner;

/**
 * Created by anthonypajerowski on 1/12/17.
 */
public class Main {

    public static void main( String [] args) {
        Scanner sc = new Scanner(System.in);
        SumOrProduct doingMath = new SumOrProduct();
        System.out.println("Enter a number, 'n'");
        int userNumber = sc.nextInt();
        System.out.println("Enter 'Add' or 'Multiply'");
        String mathFunction = sc.next();
        if (mathFunction.equals("Add")){
            doingMath.sumOfNumbers(userNumber);
        } else if(mathFunction.equals("Multiply")){
            doingMath.productOfNumbers(userNumber);
        } else System.out.println("Did you read the little directions?");
        sc.close();
    }

}
