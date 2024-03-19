//Problem Link: https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = n * (n + 1) / 2;

        for(int i = 0; i < nums.length; i++){
            total_sum -= nums[i];
        }

        return total_sum;
        
    }
}