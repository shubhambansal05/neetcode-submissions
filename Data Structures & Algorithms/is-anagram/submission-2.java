class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] arrS = new int[26];
        int[] arrT = new int[26];
        for(char c: s.toCharArray())
            arrS[c-'a'] += 1;
        for(char c: t.toCharArray())
            arrT[c-'a'] += 1;
        for(int i=0; i<26; i++)
            if (arrS[i] != arrT[i])
                return false;
        return true;
    }
}
