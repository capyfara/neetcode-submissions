class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Exclude zeroes for total
        int all = 1; int zeroes = 0;
        for (int i : nums) {
            if (i != 0) all *= i;
            else zeroes++;
        }

        int[] result = new int[nums.length]; 
        for (int i = 0; i < nums.length; i++) {
            if (zeroes == 1 && nums[i] == 0) {
                result[i] = all;
            } else if (zeroes >= 1) {
                result[i] = 0;
            } else {
                result[i] = all / nums[i];
            }
        }

        return result;
    }
}  
