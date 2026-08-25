class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> jp = new ArrayList<>();
        int n=nums.length;
        int k=n/3;
        for(int i=0;i<n;i++){
            int count=0;
            
              for(int j=0;j<n;j++){
                  if(nums[i]==nums[j]){
                    count++;
                  }
              }
               if(count>k){
                 if (!jp.contains(nums[i])) {
                     jp.add(nums[i]);
                              }
                  
        }
        }
        return jp;

    }
}