class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length/2;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int ne=0;
        int p=0;
           for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg[ne++]=nums[i];
            }
            else{
                pos[p++]=nums[i];
            }
           }
           for(int i=0;i<n;i++){
              nums[2*i]=pos[i];
              nums[2*i+1]=neg[i];
           }
        return nums;
    }
}