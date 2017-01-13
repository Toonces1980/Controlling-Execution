package pajerowski.tony;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 1/13/17.
 */
public class GuessANumberTest {

    GuessANumber tracker;

    @Before
    public void gettingReady(){
        tracker = new GuessANumber();
    }

    @Test
    public void isSecretTrueTest(){
        Boolean expected = true;
        tracker.secretNumber = 4;
        Boolean actual = tracker.isSecret(4);
        assertEquals("I expect the return to be true", expected, actual);
    }

    @Test
    public void isSecretFalseTest() {
        Boolean expected = false;
        tracker.secretNumber = 3;
        Boolean actual = tracker.isSecret(4);
        assertEquals("I expect the return to be false", expected, actual);
    }

    @Test
    public void makeGuessTest(){
        tracker.counter = 1;


    }

}
