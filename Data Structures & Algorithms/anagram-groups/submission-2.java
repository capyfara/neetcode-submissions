class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Hashmap to group anagrams
        HashMap<String, List<String>> freq = new HashMap<>();

        for(String s : strs) {
            // List to keep track of letter freq per string
           int count[] = new int[26];

            // Break string into char array
            char[] arr = s.toCharArray();

            // Increment letter count when encountered
            for(char c : arr) {
                count[c - 'a']++;
            }

            // Convert to a string bc arrays won't be recognized as equal by is values
            String text = Arrays.toString(count);

            freq.putIfAbsent(text, new ArrayList<>());
            freq.get(text).add(s);
        }

        return new ArrayList<>(freq.values());
    }
}
