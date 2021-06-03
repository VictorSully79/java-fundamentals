package javaFundamentals;

import java.lang.*;
import java.util.*;

public class DiceRoll {
    public static long[] roll(int num) {
        int[] numberArray = {1, 2, 3, 4};
        System.out.println(num);

        long[] randomRollArray = new long[num];

        for (int i = 0; i < num; i++) {
            double randomNumber = (1 + Math.random() * 6);
            long ranNum = Math.round(Math.floor(randomNumber));
            randomRollArray[i] = ranNum;

            System.out.println(ranNum);
        }
        return randomRollArray;

    }
}
