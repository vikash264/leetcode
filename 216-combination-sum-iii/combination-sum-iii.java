import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), ans);
        return ans;
    }
    private void backtrack(int start, int k, int target, List<Integer> current, List<List<Integer>> ans){
        if(current.size() == k && target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(current.size() == k || target < 0) return;
        for(int i = start; i <= 9; i++){
            current.add(i);
            backtrack(i+1, k, target - i, current ,ans);
            current.remove(current.size() - 1);
        }
    }
}