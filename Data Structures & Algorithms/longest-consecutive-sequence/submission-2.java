class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int last = 0; int max = 0; int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - last == 1 || i == 0) {
                count++;
            } else if (nums[i] - last > 1) {
                count = 1;
            }
            last = nums[i];
            max = count > max ? count : max;
        }
        return max;
    }
}
