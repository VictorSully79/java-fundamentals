package javaFundamentals;

import org.junit.Test;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculateAverageTest {
    @Test

    public void averageTest() {
        double expected = 2.8;
        int[] nums = {1, 2, 3, 3, 5};
        double actual = CalculateAverage.calculatedAverage(nums);
        assertEquals(expected,actual,0);
    }
}
