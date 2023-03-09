package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultOne {
    @Test
    public void testMultipleZeros() {
        // given  |   Setup
        int[] input = { 1, 2, 0, 3, 4, 0, 5};
        // when   |    Execute
        int result = FaultOne.numZero(input);
        // then   |    Validate/Check
        Assert.assertEquals(2, result);
    }

    @Test
    public void testThreeZeros() {
        Assert.assertEquals(3,
                FaultOne.numZero(new int[] { 1, 2, 0, 0, 4, 0, 5}));
    }

    @Test
    public void testNoZeros() {
        int[] input = { 1, 2, 3, 4, 5};
        int result = FaultOne.numZero(input);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testEmptyArray() {
        int[] input = { };
        int result = FaultOne.numZero(input);
        Assert.assertEquals(0, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNull() {
        FaultOne.numZero(null);
    }

    @Test
    public void testOnlyZeros() {
        int[] input = { 0, 0, 0};
        int result = FaultOne.numZero(input);
        Assert.assertEquals(3, result);
    }

}
