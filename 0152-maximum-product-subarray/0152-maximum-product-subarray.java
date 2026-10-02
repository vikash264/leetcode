// class Solution {
//     public int maxProduct(int[] nums) {
//         int n = nums.length;
//         int maxProd = nums[0];
//         int minProd = nums[0];
//         int ans = nums[0];
        
//         for(int i=1; i<n; i++){
//             if(nums[i] < 0){
//                 int temp = maxProd;
//                 maxProd = minProd;
//                 minProd = temp;
//             }

//             maxProd = Math.max(nums[i], maxProd * nums[i]);
//             minProd = Math.min(nums[i], minProd * nums[i]);
            
//             ans = Math.max(ans, maxProd);
//         }
//         return ans;
        
//     }
// }

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;
        int  left= 1;
        int right = 1;

        for (int i=0; i<n; i++) {
            if (left == 0) left = 1;
            if (right == 0) right = 1;

            left *= nums[i];
            right *= nums[n-1-i];

            maxProd = Math.max(maxProd, Math.max(left, right));
        }
        return maxProd;
    }
}