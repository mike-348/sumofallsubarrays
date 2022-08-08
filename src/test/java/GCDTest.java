import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kristofer on 7/14/20.
 */

public class GCDTest {

    @Test
    public void recursiveGcdTest() {
        //given
        GCD gcd = new GCD();
        int expected = 4;

        //when
        int actual = gcd.recursiveGcd(8, 12);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iterativeGcdTest() {
        //given
        GCD gcd = new GCD();
        int expected = 4;

        //when
        int actual = gcd.iterativeGcd(8, 12);

        //then
        Assert.assertEquals(expected, actual);
    }
}
