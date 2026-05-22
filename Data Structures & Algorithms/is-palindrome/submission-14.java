class Solution {
    public boolean isPalindrome(String s) {
        // Use left and right counters
        // Letters and numbers are allowed
        int l = 0;
        int r = s.length() - 1;
        String low = s.toLowerCase();
        while (l < r) {
            while (!Character.isLetterOrDigit(low.charAt(l)) && l < r) l++;
            while (!Character.isLetterOrDigit(low.charAt(r)) && r > l) r--;
            if (low.charAt(l) != low.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
}
