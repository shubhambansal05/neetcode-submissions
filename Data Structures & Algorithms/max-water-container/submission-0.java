class Solution {
    public int maxArea(int[] heights) {
        int sumMax = 0;
        for(int i=0; i<heights.length-1; i++){
            for(int j=i+1; j<heights.length; j++){
                int sum = (j-i) * Math.min(heights[i], heights[j]);
                sumMax = Math.max(sumMax, sum);
            }
        }
        return sumMax;
    }
}
