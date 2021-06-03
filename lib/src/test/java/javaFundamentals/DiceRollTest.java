package javaFundamentals;

import org.junit.Test;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiceRollTest {
    @Test
    public void DiceTest() {
        int num = 5;
        long[] randomRollArray = DiceRoll.roll(num);
        long expected = num;
        long actual = randomRollArray.length;
        assertEquals(expected, actual);
    }
}


