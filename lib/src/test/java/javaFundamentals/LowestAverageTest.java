package javaFundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowestAverageTest {


    @Test
    public void lowestAverage() {
        double expected = 57.42857142857143;
        int[][] weeklyMonthTemperatures = {
                {69, 64, 59, 55, 71, 57, 60},
                {57, 65, 85, 90, 72, 65, 51},
                {55, 54, 70, 53, 59, 67, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        double actual = LowestAverage.lowestAverage(weeklyMonthTemperatures);
        assertEquals(expected,actual,0);
    }
}
