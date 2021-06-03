package javaFundamentals;

import org.junit.Test;
import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertFalse;

public class DuplicateCheckTest {
    @Test
    public void duplicateTest() {
        int[] nums = {3, 4, 5, 6};
        boolean result = DuplicateCheck.doubleCheck(nums);
        assertFalse("There are no duplicates", result);
    }

}


