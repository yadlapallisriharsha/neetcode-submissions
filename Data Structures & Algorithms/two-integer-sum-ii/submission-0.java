class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        int j=0;
       for(int i=1;i<n;i++) {
           if(numbers[i]+numbers[j]==target){
            arr[j]=numbers[i-1];
            arr[i]=numbers[i];
            j++;
           }
       }
       return arr;
    }
}
