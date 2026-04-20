class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        Set<Integer> set = new HashSet<>();
        while(temp!=1) {
            temp = sumSquare(temp);
            if(set.contains(temp)) {
                return false;
            }
            set.add(temp);
        }
        return true;
    }

    public int sumSquare(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            n = n/10;
            sum = sum + (rem*rem);
        }
        return sum;
    }
}
