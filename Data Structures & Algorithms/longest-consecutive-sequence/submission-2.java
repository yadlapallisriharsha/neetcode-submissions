class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++){
            int diff=Math.abs(nums[i]-nums[i-1]);
            if(diff==1){
                count++;
            }
        }
        return count;
    }
}
