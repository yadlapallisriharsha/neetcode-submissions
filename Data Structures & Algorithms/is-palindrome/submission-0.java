class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] a=str.toCharArray();
        int left=0;
        int right=a.length-1;
        while(left<right){
           char temp=a[left];
           a[left]=a[right];
           a[right]=temp;
            left++;
            right--;
        }
        String st=new String(a);
        if(str.equals(st)){
            return true;
        }
        return false;
    }
}
