class Solution {
    public int longestConsecutive(int[] nums) {
        // find the start of the sequence
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        
        int max = 0;
        for (int n : nums) {
            int count = 0;
            if (!set.contains(n-1)) {
                while (set.contains(n++)) {
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
