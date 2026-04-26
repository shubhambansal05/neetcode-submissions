class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("₹");
            for(int i=s.length()-1; i>=0; i--)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '₹')
                j++;
            int l = Integer.parseInt(str.substring(i, j));
            char[] arr = new char[l];
            for(int k=j+1,x=0; k<j+1+l; k++,x++)
                arr[x] = str.charAt(j+l-x);
            result.add(new String(arr));
            i=j+1+l;
        }
        return result;
    }
}
