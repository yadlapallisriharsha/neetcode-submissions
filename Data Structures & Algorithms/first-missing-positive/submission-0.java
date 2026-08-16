class Solution {
    public int firstMissingPositive(int[] nums){
      Arrays.sort(nums);
      int pre=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            int diff=nums[i]-pre;
              if(diff>1){
               return pre+1;
              }
              if(diff==1){
                pre=nums[i];
              }
              if(diff==0){
                continue;
              }
        }
     return pre+1;
    }
}