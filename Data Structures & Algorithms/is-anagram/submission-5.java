class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
 
        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            hash1.compute(c1, (k, v) -> (v == null ? 1 : v + 1));
            hash2.compute(c2, (k, v) -> (v == null ? 1 : v + 1));
        }

        return hash1.equals(hash2);
    }
}
