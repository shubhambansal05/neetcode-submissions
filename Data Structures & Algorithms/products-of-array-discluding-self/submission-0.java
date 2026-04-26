class Solution {
    public int[] productExceptSelf(int[] nums) {
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
            map.put(i + "_" + i, nums[i]);
        for(int w = 1; w<nums.length; w++){
            for(int i=0, j=i+w; j<nums.length; i++,j++){
                map.put(i + "_" + j, map.get(i + "_" + (j-1)) * nums[j]);
            }
        }
        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            result[i] = map.getOrDefault(0 + "_" + (i-1), 1) 
                        * map.getOrDefault((i+1) + "_" + (nums.length-1), 1);
        }
        return result;
    }
}  
