class Solution {

    public String encode(List<String> strs) {
       StringBuffer sb=new StringBuffer();
       for(String str:strs){
        sb.append(str.length()).append("#").append(str);
       }
       return sb.toString();
    }
    public List<String> decode(String str) {
        ArrayList<String> ans=new ArrayList<>();
       int i=0;
       while(i<str.length()){
         int j=i;
         while(str.charAt(j)!='#'){
            j++;
         }
         int len=Integer.parseInt(str.substring(i,j));
         int start=j+1;
         int end=len+start;
         ans.add(str.substring(start,end));
         i=end;
       }
      return ans;
    }
}
