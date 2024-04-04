//Problem Link-> https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
//Running for loop to iterate over a nums
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){
                    k--;
                }
                if(sum < 0){
                    j++;
                }
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]){
                        j++;
                    }
                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
