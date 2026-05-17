class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append("#").append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        int start = 0; int end = 0;
        while (start < str.length()) {
            // Get the number
            while (str.charAt(end++) != '#') {}

            // We found the # which means we got the length
            int len = Integer.parseInt(str.substring(start, end - 1));

            start = end;
            end = end + len;

            decoded.add(str.substring(start, end));

            start = end; end = start;
        }
        return decoded;
    }
}
