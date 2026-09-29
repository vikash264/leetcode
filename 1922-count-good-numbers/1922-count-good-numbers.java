class Solution {
    private static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n){
        long even = (n + 1) / 2;
        long odd = n / 2;

        long total = (power(5, even) * power(4, odd)) % MOD;
        return (int) total;
    }

    private long power(long base, long exp) {
        if (exp == 0) return 1;
        
        long half = power(base, exp / 2);
        long halfSquare = (half * half) % MOD;

        if (exp % 2 == 0) return halfSquare;
        else return (halfSquare * base) % MOD;
    }
}