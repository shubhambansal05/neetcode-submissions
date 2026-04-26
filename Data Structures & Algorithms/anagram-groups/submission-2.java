class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String s = new String(cArr);
            map.computeIfAbsent(s, k->new ArrayList<String>()).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
