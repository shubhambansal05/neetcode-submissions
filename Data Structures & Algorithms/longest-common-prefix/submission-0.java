class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        for(String str: strs){
            if ("".equals(str))
                return "";
            min = Math.min(min, str.length());
        }
        String pref = "";
        boolean flag = true;
        for(int i=0; i<min; i++){
            if (!flag)
                break;
            char c = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if (strs[j].charAt(i) != c)
                    flag = false;
            }
            if (flag)
                pref = pref + c;
        }
        return pref;
    }
}