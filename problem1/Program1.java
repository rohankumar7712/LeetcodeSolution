class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);

        }
        return null;
    }
}

//Test cases:Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]


Input: nums = [3,2,4], target = 6
Output: [1,2]


Input: nums = [3,3], target = 6
Output: [0,1]


