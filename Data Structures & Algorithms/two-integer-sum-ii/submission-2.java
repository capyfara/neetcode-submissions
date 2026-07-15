class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // How do i use the 2 pointer method here
        // Oh, I just base it on the sum
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[] {l + 1, r + 1};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[] {0};
    }
}
