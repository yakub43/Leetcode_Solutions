// Problem - Link: https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int count = 0;

        for(int num: nums){
            int numCount = ans.getOrDefault(num, 0);
            count = count + numCount;
            ans.put(num, numCount+1);
        }
        return count;
    }
}