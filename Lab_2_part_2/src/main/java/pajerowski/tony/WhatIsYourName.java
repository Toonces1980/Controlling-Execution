package pajerowski.tony;
import java.util.Scanner;
/**
 * Created by anthonypajerowski on 1/12/17.
 */

public class WhatIsYourName {

    public String nameChecker(String user) {
        if (user.equals("Alice")) {
            return "Alice";
        } else if (user.equals("Bob")) {
            return "Bob";
        } else return "Hi.";
    }
}
