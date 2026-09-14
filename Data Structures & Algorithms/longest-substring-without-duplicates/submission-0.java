class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<s.length();){
         if(!(hs.contains(s.charAt(r)))){
            hs.add(s.charAt(r));
            max=Math.max(max,r-l+1);
            r++;
         }else{
            hs.remove(s. charAt(l));
            l++;
         }
        }
        return max;
    }
}
