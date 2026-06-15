class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Non-decreasing -> increasing but can be the same number

        // Find the 2 indeces that add up to target
        // index1 < index2 && index1 != index2

        // two pointer method 
        // 1. check if the numbers are not the same
        // 2. how do we determine which pointer to move? this is where i struggle

        // Trying brute force: check every combination
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    continue;
                }
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i+1, j+1};
                }  
            }
        }
        return new int[0];
    }
}
