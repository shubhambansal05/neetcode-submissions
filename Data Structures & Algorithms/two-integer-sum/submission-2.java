class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> rem = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if(rem.containsKey(target - nums[i]))
                return new int[]{rem.get(target - nums[i]), i};
            rem.put(nums[i], i);
        }
        return new int[]{};
    }
}
