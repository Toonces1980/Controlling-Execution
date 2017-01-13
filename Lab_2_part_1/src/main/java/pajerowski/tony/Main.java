package pajerowski.tony;

import java.util.Scanner;

/**
 * Created by anthonypajerowski on 1/13/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserNumbers cruncher = new UserNumbers();
        System.out.println("Enter an integer 'n'");
        int n = sc.nextInt();
        System.out.println("The sum of 1 through " + n + " is " + cruncher.addTheNumbers(n));
        sc.close();
    }
}