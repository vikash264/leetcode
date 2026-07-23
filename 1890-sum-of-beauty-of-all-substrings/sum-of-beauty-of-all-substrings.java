class Solution {
    public int beautySum(String s) {
        int n  = s.length();
        int total_beauty = 0;
        for(int i = 0; i<=n-1; i++){
            int[] freq = new int[26];
            for(int j=i; j<=n-1; j++){
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for(int count : freq){
                    if(count > 0){
                        maxFreq = Math.max(maxFreq, count);
                        minFreq = Math.min(minFreq, count);
                    }
                }
                total_beauty += (maxFreq - minFreq);
            }
        }
        return total_beauty;
    }
}