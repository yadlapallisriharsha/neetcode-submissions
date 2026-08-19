class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int j=0;
       for(int i=1;i<n;i++) {
           if(numbers[i]+numbers[j]==target){
            return new int[]{numbers[j],numbers[i]};
           }
           j++;
       }
       return new int[]{-1,-1};
    }
}
