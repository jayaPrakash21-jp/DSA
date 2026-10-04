class Solution {
    public boolean isPalindrome(int k) {
        int sum=0;
          int temp=k;
          while(k>0){
            int y=k%10;
            sum=(sum*10)+y;
            k=k/10;
            
    }
    if(sum==temp){
        return true;
}
return false;
    }
}