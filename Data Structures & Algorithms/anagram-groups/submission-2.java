class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0; i<strs.length; i++) {
            if (visited[i]) continue;
            List<String> each = new ArrayList<>();
            String str1 = strs[i];
            String sorted1 = transform(str1);
            each.add(str1);
            visited[i] = true;
            for(int j=i+1; j<strs.length; j++) {
                if (visited[j]) continue;
                String str2 = strs[j];
                 String sorted2 = transform(str2);  
                if(str1.length()==str2.length() && sorted1.equalsIgnoreCase(sorted2)) {
                    each.add(str2);
                    visited[j] = true;
                }
            }
            res.add(each);
        }
        return res;
    }

    public String transform(String str) {
        char[] chars1 = str.toCharArray();
        Arrays.sort(chars1);
        return new String(chars1); 
    }
}