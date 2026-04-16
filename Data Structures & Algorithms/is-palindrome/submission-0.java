class Solution {
    public boolean isPalindrome(String s) {
        int high = s.length()-1;
        int low = 0;
        while(low<=high) {
            if(check(s.charAt(low)) && check(s.charAt(high))) {
                if(Character.toLowerCase(s.charAt(low))!=Character.toLowerCase(s.charAt(high))) {
                    return false;
                }
            }
            if(check(s.charAt(low)) && !check(s.charAt(high))) {
                high = high-1;
            }
            else if(!check(s.charAt(low)) && check(s.charAt(high))) {
                low = low+1;
            }
            else {
                low = low+1;
                high = high-1;
            }

        }
        return true;
    }

    public boolean check(char c) {
        return Character.isLetterOrDigit(c);
    }
}
