class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> existing = new HashSet<>();

       for(int i = 0; i < nums.length; i++) {
        if(existing.contains(nums[i])) return true;
        existing.add(nums[i]);
       }

       return false;
    }
}