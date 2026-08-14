class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++){
            int diff=nums[i]-nums[i-1];
            if(diff==1){
                count++;
            }
        }
        return count;
    }
}
