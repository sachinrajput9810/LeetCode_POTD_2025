package Leetcode_Jan;

import java.util.HashSet;

public class day_2_count_vowel_in_range {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> set = new HashSet<>() ;
        set.add('a') ;
        set.add('e') ;
        set.add('i') ;
        set.add('o') ;
        set.add('u') ;

        int n = words.length ;
        int pre[] = new int[n] ;
        if(set.contains(words[0].charAt(0)) && set.contains(words[0].charAt(words[0].length()-1)) ) pre[0] = 1 ;
        for(int i=1 ; i<n ; i++){
            String str = words[i] ;
            char first = str.charAt(0) ;
            char last = str.charAt(str.length()-1) ;
            if(set.contains(first) && set.contains(last)){
                pre[i] = pre[i-1] + 1 ;
            }
            else pre[i] = pre[i-1] ;
        }
        int m = queries.length ;
        int res[] = new int[m] ;

        for(int k=0 ; k<m ; k++){
            int i = queries[k][0] ;
            int j = queries[k][1] ;
            int last = pre[j] ;
            int first = pre[i] ;
            if(i == 0){
                res[k] = pre[j] ;
            }
            else res[k] = pre[j] - pre[i-1] ;
        }
        return res ;
    }
}
