package pajerowski.tony;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 1/13/17.
 */
public class UserNumbersTest {

    UserNumbers user;

    @Before
    public void setUp(){
        user = new pajerowski.tony.UserNumbers();
    }

    @Test
    public void addTheNumbersTest(){
        Integer expected = 6;
        Integer actual = user.addTheNumbers(3);
        assertEquals("I expect the sum of all number from 1 to 3 to equal 6", expected, actual);
    }
}
