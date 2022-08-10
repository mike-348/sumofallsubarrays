import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SumSubArraysTest {
    @Test
    public void sumSubArraysTest1() {
        //given
        Integer[] arr = {1, 3, 5, 4};
        Integer expected = 68;

        //when
        SumSubArrays sum = new SumSubArrays();
        Integer actual1 = sum.sumSubArrayOn(arr);
        Integer actual2 = sum.sumSubArrayOn2(arr);
        Integer actual3 = sum.sumSubArrayOn3(arr);



        Assert.assertEquals(expected, sum.sumSubArrayOn3(arr));
        Assert.assertEquals(expected, sum.sumSubArrayOn2(arr));
        Assert.assertEquals(expected, sum.sumSubArrayOn(arr));
    }

    @Test
    public void sumSubArraysTest2() {
        //given
        Integer[] arr = {1};
        Integer expected = 1;

        //when
        SumSubArrays sum = new SumSubArrays();
        Integer actual1 = sum.sumSubArrayOn(arr);
        Integer actual2 = sum.sumSubArrayOn2(arr);
        Integer actual3 = sum.sumSubArrayOn3(arr);

        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);
        Assert.assertEquals(expected, actual3);
    }

    @Test
    public void sumSubArraysTest3() {
        //given
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }
        Integer[] arr = list.toArray(new Integer[0]);
        Integer expected = 2062704876;

        //when
        SumSubArrays sum = new SumSubArrays();
        Integer actual1 = sum.sumSubArrayOn(arr);
        Integer actual2 = sum.sumSubArrayOn2(arr);
        Integer actual3 = sum.sumSubArrayOn3(arr);

        Assert.assertEquals(expected, actual1);
        Assert.assertEquals(expected, actual2);
        Assert.assertEquals(expected, actual3);
    }
}
