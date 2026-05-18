class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return false;
        String low = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (Character.isLetterOrDigit(low.charAt(i)) == false && i < j) i++;
            while (Character.isLetterOrDigit(low.charAt(j)) == false && j > i) j--;
            if (low.charAt(i) != low.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
