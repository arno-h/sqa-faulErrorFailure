package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultTwo {
    @Test
    public void testNumberAtFirstPosition() {
        int pos = FaultTwo.findLast(new int[] {2, 3, 5, 8}, 2);
        Assert.assertEquals(0, pos);
    }

    @Test
    public void testNumberAtLastPosition() {
        int pos = FaultTwo.findLast(new int[] {3, 5, 8, 2}, 2);
        Assert.assertEquals(3, pos);
    }

    @Test
    public void testNumberNotFound() {
        int pos = FaultTwo.findLast(new int[] {3, 5, 8, 7}, 2);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void testEmptyArray() {
        int pos = FaultTwo.findLast(new int[] {}, 2);
        Assert.assertEquals(-1, pos);
    }

    @Test(expected = NullPointerException.class)
    public void testNull() {
        FaultTwo.findLast(null, 1234);
    }
}
