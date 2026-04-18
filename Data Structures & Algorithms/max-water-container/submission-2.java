class Solution {
    public int maxArea(int[] heights) {
        int maxW = 0;
        int n = heights.length;
        for(int i=0; i<n ;i++) {
            for(int j=i+1; j<n ; j++) {
                maxW = Math.max(maxW, (j-i) * (Math.min(heights[i], heights[j])));
            }
        }
        return maxW;
    }
}
