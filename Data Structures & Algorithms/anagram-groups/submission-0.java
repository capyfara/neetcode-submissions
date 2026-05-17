class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> groups = new HashMap<>();
        
        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String sorted = new String(arr);

            // If key (sorted) does not exist then initialize the list
            groups.putIfAbsent(sorted,new ArrayList<>());
            // Add the string to list
            groups.get(sorted).add(s);
        }

        return new ArrayList<>(groups.values());   
    }
}