class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> rem = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            rem.put(nums[i], i);
            nums[i] = target - nums[i];
        }
        for (int i=0; i<nums.length; i++){
            if(rem.containsKey(nums[i]) && i != rem.get(nums[i]))
                return new int[]{i, rem.get(nums[i])};
        }
        return null;
    }
}
