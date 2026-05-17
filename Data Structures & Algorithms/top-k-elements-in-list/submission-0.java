class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (Integer n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : freq.keySet()) {
            int keyFreq = freq.get(key);

            if(bucket[keyFreq] == null) {
                bucket[keyFreq] = new ArrayList<>();
            }
            bucket[keyFreq].add(key);
        }
        
        List<Integer> result = new ArrayList<>();

        for (int i = nums.length; i > 0 && result.size() < k; i--) {
            if(bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}