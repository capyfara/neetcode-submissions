class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> addend = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if (addend.containsKey(target - nums[i])) {
                return new int[] {addend.get(target - nums[i]), i}; 
            } else {
                addend.put(nums[i], i);
            }
        }

        return null;
    }
}
