class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Value, Index
        HashMap<Integer, Integer> pair = new HashMap<>();
        pair.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (pair.get(target - nums[i]) != null) {
                return new int[] {pair.get(target - nums[i]), i};
            } else {
                pair.put(nums[i], i);
            }
        }
        return null;
    }
}
