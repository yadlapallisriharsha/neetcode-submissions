class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[i]=nums[i];
        }
        int j=nums.length;
        for(int i=0;i<nums.length;i++){
            if(j<nums2.length){
            nums2[j]=nums[i];
            j++;
            }
        }
        return nums2;
    }
}