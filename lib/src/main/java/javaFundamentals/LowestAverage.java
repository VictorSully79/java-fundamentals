package javaFundamentals;

import static javaFundamentals.CalculateAverage.calculatedAverage;

public class LowestAverage {
    public static double lowestAverage(int[][] arrayOfArrays) {

        double lowestAvg = 1000;
        for (int i = 0; i < arrayOfArrays.length; i++) {
            double tempAvg = calculatedAverage(arrayOfArrays[i]);
            System.out.println("The Average is " + tempAvg);

            if (tempAvg < lowestAvg) {
                lowestAvg = tempAvg;
            }
            System.out.println("The lowest average is " + lowestAvg);
        }
        return lowestAvg;
    }
}
