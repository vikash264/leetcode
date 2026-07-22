class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        String Lps="";

        for(int i=0; i<s.length(); i++){
            int low=i;
            int high=i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high==s.length()) 
                break;
            }
            String palindrome=s.substring(low+1, high);
            if(palindrome.length() > Lps.length()){
                Lps = palindrome;
            }
            low=i-1;
            high=i;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            palindrome=s.substring(low+1, high); 
            if(palindrome.length() > Lps.length()){
                Lps = palindrome;
            }
        }
        return Lps;
    }
}