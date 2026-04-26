class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        }
        for (int i=0; i<(sb.length()+1)/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i))
                return false;
        }
        return true;
    }
}
