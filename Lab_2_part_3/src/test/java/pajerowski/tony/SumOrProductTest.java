package pajerowski.tony;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonypajerowski on 1/13/17.
 */

public class SumOrProductTest {

    SumOrProduct sop;

    @Before
    public void gettingReady(){
        sop = new SumOrProduct();
    }

    @Test
    public void sumOfNumbersTest(){
        Integer expected = 10;
        Integer actual = sop.sumOfNumbers(4);
        assertEquals("The sum of 1 through 4 should be 10", expected, actual);
    }

    @Test
    public void productOfNumbersTest(){
        Integer expected = 24;
        Integer actual = sop.productOfNumbers(4);
        assertEquals("The product of 1 through 4 should be 24", expected, actual);
    }

}
