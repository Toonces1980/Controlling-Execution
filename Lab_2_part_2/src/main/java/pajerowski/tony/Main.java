package pajerowski.tony;

import java.util.Scanner;

/**
 * Created by anthonypajerowski on 1/13/17.
 */
public class Main {
    public static void main(String [] args) {
        
        System.out.println("What is your name?");
        WhatIsYourName namer = new WhatIsYourName();
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println(namer.nameChecker(userName));
        sc.close();

    }
}
