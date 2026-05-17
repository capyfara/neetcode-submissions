class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> existing = new HashSet<>();
        
        for (int n : nums) {
            if (!existing.add(n)) {
                return true;
            }
        }
        return false;
    }
}