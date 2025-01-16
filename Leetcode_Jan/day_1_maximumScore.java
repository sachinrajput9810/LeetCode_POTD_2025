package Leetcode_Jan;

public class day_1_maximumScore {
    public int maxScore(String s) {
        int n = s.length() ;
        int one = 0 ;
        int zero = 0 ;
        int totalOne = 0 ;
        int res = -1 ;
        for(char ch : s.toCharArray()){
            if(ch == '1') totalOne++ ;
        }

        for(int i=0 ; i<n-1 ; i++){
            if(s.charAt(i) == '0') zero++ ;
            else one++ ;

            int score = zero + (totalOne - one) ;
            res = Math.max(res , score) ;
        }
        return res ;
    }
}
