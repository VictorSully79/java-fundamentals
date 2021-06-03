package javaFundamentals;

public class CalculateAverage {
    public static double calculatedAverage(int[] nums) {
        double total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];

        }
        double average = total / nums.length;
        return average;
    }
}

