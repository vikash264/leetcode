// import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0,1);
        for(int num : nums){
            currentSum += num;

            if(prefixSums.containsKey(currentSum-k)){
                count += prefixSums.get(currentSum - k);
            }
            prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}