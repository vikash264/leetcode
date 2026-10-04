import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, target, candidates, new ArrayList<>(), ans);
        return ans;
    }
    private void backtrack(int start, int target, int[] candidates, List<Integer> current,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++){
            if (candidates[i] > target) break;
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            current.add(candidates[i]);
            backtrack(i + 1, target - candidates[i], candidates, current, ans);
            current.remove(current.size() - 1);
        }
    }
}