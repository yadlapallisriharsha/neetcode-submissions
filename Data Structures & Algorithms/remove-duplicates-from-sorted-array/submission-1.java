class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=0;
        for(int s:set){
            nums[i++]=s;
        }
        return set.size();
    }
}