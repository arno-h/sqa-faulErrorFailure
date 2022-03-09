package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultTwo {
    @Test
    public void findNumber() {
        int pos = FaultTwo.findLast(new int[] {2, 3, 5, 8}, 2);
        Assert.assertEquals(1, pos);
    }
}
