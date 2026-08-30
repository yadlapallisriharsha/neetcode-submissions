class Solution {
    public boolean validPalindrome(String s) {
      if(palin(s))
      {
        return true;
      }
      for(int i=0;i<s.length();i++){
        String temp=s.substring(0,i)+s.substring(i+1);
         if(palin(temp))
      {
        return true;
      }
      }
      return false;
    }
    public static boolean palin(String s){
      int l=0;
      int r=s.length()-1;
      while(l<=r){
        if(s.charAt(l)!=s.charAt(r)){
          return false;
        }
        l++;
        r--;
      }
      return true;
    }
}