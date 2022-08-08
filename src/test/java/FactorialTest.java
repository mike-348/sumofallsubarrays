import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kristofer on 7/14/20.
 */
public class FactorialTest {

    @Test
    public void recursiveFactorialTest() {
        //given
        Factorial fact = new Factorial();
        int expected = 24;

        //when
        int actual = fact.recursiveFactorial(4);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iterativeFactorialTest() {
        //given
        Factorial fact = new Factorial();
        int expected = 24;

        //when
        int actual = fact.iterativeFactorial(4);

        //then
        Assert.assertEquals(expected, actual);
    }
}