class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer,Integer> jp = new HashMap<>();
          for(int x : nums){
            jp.put(x,jp.getOrDefault(x,0)+1);
            if(jp.get(x)>nums.length/2){
                return x;
            }
          }
          return -1;
    }
}