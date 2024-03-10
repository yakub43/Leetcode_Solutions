// Problem Link -> https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sol = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                sol[0] = map.get(target - nums[i]);
                sol[1] = i;
            }
            map.put(nums[i], i);
        }
        return sol;
    }
}
