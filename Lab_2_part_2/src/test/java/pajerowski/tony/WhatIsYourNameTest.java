package pajerowski.tony;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 1/13/17.
 */
public class WhatIsYourNameTest {
    WhatIsYourName nameInstance = new WhatIsYourName();

    @Test
    public void nameCheckerBobTest(){
     String expected = "Bob";
     String actual = nameInstance.nameChecker("Bob");
     assertEquals("I expect the name passed into the nameChecker to output 'Bob'", expected, actual);
    }

    @Test
    public void nameCheckerAliceTest(){
        String expected = "Alice";
        String actual = nameInstance.nameChecker("Alice");
        assertEquals("I expect the name passed into the nameChecker to output 'Alice'", expected, actual);
    }

    @Test
    public void nameCheckerHiTest(){
        String expected = "Hi.";
        String actual = nameInstance.nameChecker("Hi");
        assertEquals("I expect the name passed into the nameChecker to output 'Hi.'", expected, actual);

    }
}
