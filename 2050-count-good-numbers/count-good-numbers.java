class Solution {
    static final long MOD = 1_000_000_007;
    public int countGoodNumbers(long n){
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;
        long ans = power(5, evenPositions);
        ans = (ans * power(4, oddPositions)) % MOD;
        return (int) ans;
    }
    private long power(long base, long exp){
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}