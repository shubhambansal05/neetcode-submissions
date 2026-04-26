class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int maxLen = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int x = n;
                int len = 1;
                while(set.contains(x+1)){
                    x++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
