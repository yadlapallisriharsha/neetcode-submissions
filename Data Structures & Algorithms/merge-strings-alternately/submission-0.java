class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length()==0&&word2.length()==0){
            return "";
        }
       int n=0;
       if(word1.length()>word2.length()){
         n=word1.length();
       }
       else{
        n=word2.length();
       }
       StringBuffer ans=new StringBuffer();
       for(int i=0;i<n;i++){
        if(i<word1.length())
          ans.append(word1.charAt(i));
        if(i<word2.length())
          ans.append(word2.charAt(i));
       }
       return ans.toString();
    }
}