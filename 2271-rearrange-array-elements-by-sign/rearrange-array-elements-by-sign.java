class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
       int[] ans = new int[n]; 
        int ne=1;
        int p=0;
           for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[ne]=nums[i];
                ne+=2;
            }
            else{
                ans[p]=nums[i];
                p+=2;
            }
           }
            
        return ans;
    }
}