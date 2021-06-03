package javaFundamentals;

public class DuplicateCheck {
    public static boolean doubleCheck(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("There is a match" + nums[i]);
                    return true;

                }
            }
        }
        return false;
    }
}
