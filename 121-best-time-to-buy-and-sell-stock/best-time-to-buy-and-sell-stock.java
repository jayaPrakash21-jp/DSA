class Solution {
    public int maxProfit(int[] nums) {
       int min=nums[0];
       int maxi=0;
       for(int i=1;i<nums.length;i++){
           int profit =  nums[i]-min;
           maxi= Math.max(maxi,profit);
           min=Math.min(min,nums[i]);
       }
       return maxi;
    }
}