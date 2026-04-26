class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[][] count = new int[strs.length][26];
        for (int i=0; i<strs.length; i++){
            for(int j=0; j<strs[i].length(); j++){
                char c = strs[i].charAt(j);
                count[i][c-'a']++;
            }
        }
        List<List<String>> result = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        for (int i=0; i<strs.length; i++){
            map.put(i, strs[i]);
        }
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, String> toMatch = it.next();
            it.remove();
            List<String> list = new ArrayList<>();
            list.add(toMatch.getValue());
            result.add(list);
            while(it.hasNext()){
                Map.Entry<Integer, String> curr = it.next();
                if(Arrays.equals(count[toMatch.getKey()], count[curr.getKey()])){
                    list.add(curr.getValue());
                    it.remove();
                }
            }
            it = map.entrySet().iterator();
        }
        return result;
    }
}
