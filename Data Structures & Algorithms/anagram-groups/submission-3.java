class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for(String str : strs) {
            int[] freq = new int[26];
            char[] arr = str.toCharArray();
            
            for (char c : arr) {
                freq[c - 'a']++;
            }

            String text = Arrays.toString(freq);
            if(anagrams.get(text) == null) anagrams.put(text, new ArrayList());
            anagrams.get(text).add(str); 
        }

        return new ArrayList<>(anagrams.values());
    }
}
