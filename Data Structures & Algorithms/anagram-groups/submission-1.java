class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Hashmap to group anagrams
        HashMap<String, List<String>> freq = new HashMap<>();

        for(String s : strs) {
            // List to keep track of letter freq per string
           int count[] = new int[26];

            char[] arr = s.toCharArray();

            for(char c : arr) {
                count[c - 'a']++;
            }

            String text = Arrays.toString(count);

            freq.putIfAbsent(text, new ArrayList<>());
            freq.get(text).add(s);
        }



        return new ArrayList<>(freq.values());
    }
}
