class Solution {
    public int majorityElement(int[] nums) {
         int n=nums.length;
          int majority=0;
          Arrays.sort(nums);
          for(int i=0;i<n;i++){
            majority=nums[n/2];
          }
          return majority;
    }
}