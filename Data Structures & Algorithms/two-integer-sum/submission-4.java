class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>  pair = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (pair.containsKey(target - nums[i])) {
                return new int[] {pair.get(target-nums[i]), i};
            } else {
                pair.put(nums[i], i);
            }
        }
        return new int[] {0, 0};
    }
}
