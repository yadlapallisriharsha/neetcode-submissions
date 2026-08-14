class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first=strs[0];
        String second=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            for(int j=0;j<strs.length;j++){
                if(i>=strs[j].length()||first.charAt(i)!=strs[j].charAt(i)){
                   return strs[0].substring(0,i);
                }
            }
        }
        return first;
    }
}