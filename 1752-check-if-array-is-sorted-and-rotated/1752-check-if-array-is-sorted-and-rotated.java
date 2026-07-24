class Solution {
    public boolean check(int[] nums) {
        int countDrops = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int nextIndex = (i+1) %n ;
            if(nums[i] > nums[nextIndex]){
                countDrops++;
            }
            if(countDrops > 1){
                return false;
            }
        }
        return true;
    }
}