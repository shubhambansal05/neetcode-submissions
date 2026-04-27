class Solution {
    public int maxArea(int[] heights) {
        int sumMax = 0;
        int left = 0;
        int right = heights.length - 1;
        while(left<right){
            int sum = (right - left) * Math.min(heights[left], heights[right]);
            sumMax = Math.max(sum, sumMax);
            if(heights[left] < heights[right])
                left++;
            else
                right--;
        }
        return sumMax;
    }
}
