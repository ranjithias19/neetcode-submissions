class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length-1;
        int l=0;
        while(l<n) {
            int summ = numbers[l]+numbers[n];
            if(summ==target) {
                return new int[]{l+1, n+1};
            }
            else if(summ<target) {
                l = l+1;
            }
            else {
                n = n-1;
            }
        }
        return new int[] {-1,-1};

    }
}
