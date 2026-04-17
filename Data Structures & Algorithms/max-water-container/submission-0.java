class Solution {
    public int maxArea(int[] heights) {
        int maxW = Integer.MIN_VALUE;
        int n = heights.length;
        int low = 0;
        int high = n-1;
        while(low<high) {
            int water = (high-low) * Math.min(heights[high],heights[low]);
            if(water>maxW) {
                maxW = water;
            }
            if(heights[low]<=heights[high]) {
                low++;
            }
            else {
                high--;
            }
        }
        return maxW;
    }
}
