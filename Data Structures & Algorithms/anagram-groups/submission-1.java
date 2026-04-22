class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0; i<strs.length; i++) {
            if (visited[i]) continue;
            List<String> each = new ArrayList<>();
            String str1 = strs[i];
            char[] chars1 = str1.toCharArray();
            Arrays.sort(chars1);
            String sorted1 = new String(chars1); 
            each.add(str1);
            visited[i] = true;
            for(int j=i+1; j<strs.length; j++) {
                if (visited[j]) continue;
                String str2 = strs[j];
                char[] chars2 = str2.toCharArray();
                Arrays.sort(chars2);
                String sorted2 = new String(chars2); 
            //     String strr = strs[i];
            // char[] chars11 = strr.toCharArray();
            // Arrays.sort(chars11);
            // String sorted11 = new String(chars11);   
                if(str1.length()==str2.length() && sorted1.equalsIgnoreCase(sorted2)) {
                    each.add(str2);
                    visited[j] = true;
                }
            }
            res.add(each);
        }
        return res;
    }
}