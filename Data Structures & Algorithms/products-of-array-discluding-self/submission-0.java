class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int b = nums.length;
        int[] res = new int[nums.length];
        for(int i=0; i< b ; i++) {
            int mul = 1;
            for(int j=0; j<b ; j++) {
                if(i!=j) {
                    mul*= nums[j];
                }
            }
            res[i] = mul;
        }
        return res;
    }
}  
