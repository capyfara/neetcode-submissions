class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Value, frequency
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Put into frequency buckets
        // Bucket is an array[n] of a List<Integer>
        List<Integer>[] bucket = new List[nums.length + 1];
        // If nums size is 7, max freq will be 7 so we would use index 7 ^^^
        freq.forEach((key, value) -> {
            if (bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        });

        // Return the top k elements
        List<Integer> result = new ArrayList<>();

        int top = k;
        for(int i = nums.length; i > 0 && top > 0; i--) {
            if (bucket[i] != null) {
                for(int li : bucket[i]){
                    result.add(li);
                    top--;
                }
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
