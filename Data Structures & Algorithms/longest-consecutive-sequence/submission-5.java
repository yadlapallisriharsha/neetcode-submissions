class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> s=new HashSet<>();
        for(int s1:nums){
            s.add(s1);
        }
        int max=1;
        for(int s1:s){
            if(!s.contains(s1-1)){
             int current=s1;
             int count=1;
             while(s.contains(current+1)){
               count++;
               current++;
             }
              max=Math.max(max,count);
            } 
        }
        return max;
        }
    }

