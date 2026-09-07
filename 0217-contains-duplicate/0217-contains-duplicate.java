class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;

        // second method ham Hashset se bhi kar skte hai
    //     Set<Integer> set = new Hashset<integer>();
    //     for(int num : nums){
    //         if(set.contains(num)){
    //             return true;
    //         }
    //         else{
    //             set.add(nums);
    //         }
    //     }
    //     return false;
    }
}