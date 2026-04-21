class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int length = 0;
        for(int i=0; i<s.length(); i++) {
            set.clear();
            for(int j = i; j<s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
            }
            length = Math.max(length, set.size());
        }
        return length;
    }
}