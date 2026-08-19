class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> set =new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    List<Integer> a=new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k]==0){
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        Collections.sort(a);
                        set.add(a);
                    }

                }
            }
        }
        ans.addAll(set);
        return ans;
    }
}
